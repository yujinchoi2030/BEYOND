## 젠킨스(Jenkins)
### 1. 젠킨스(jenkins)
* `젠킨스`는 소프트웨어 개발 과정에서 `지속적인 통합(Continuous Integration, CI)` 및 `지속적인 배포(Continuous Delivery, CD)`를 자동화하는 데 사용되는 오픈 소스 자동화 서버이다.
### 2. 젠킨스의 주요 기능
* 빌드 자동화를 통해 소스 코드를 컴파일하고 실행 가능한 파일로 변환한다.
* 테스트 자동화를 통해 단위 테스트, 통합 테스트 등 다양한 종류의 테스트를 자동으로 실행하여 코드의 정확성을 검증한다.
* 배포 자동화를 통해 빌드 된 결과물을 개발, 스테이징, 프로덕션 환경 등으로 자동으로 배포한다.
* 다양한 플러그인을 통해 기능을 확장하고, 다양한 도구와 통합할 수 있다.
### 3. 젠킨스의 작동 원리
* 먼저 젠킨스는 Git, SVN 등의 버전 관리 시스템과 연동하여 코드 변경을 감지한다.
* 코드 변경이 감지되면 자동으로 빌드 작업을 실행한다.
* 빌드 된 결과물에 대한 테스트를 실행하고 결과를 확인한다.
* 테스트가 성공하면 배포 작업을 실행하여 결과물을 배포한다.
* 빌드, 테스트, 배포 결과를 보고서 형태로 제공한다.
## 젠킨스(Jenkins) 설치
### 1. Helm 설치
* `Helm`은 `Kubernetes` 애플리케이션을 쉽게 배포하고 관리할 수 있도록 해주는 패키지 관리 도구이다.
  ```bash
  # Windows
  > choco install kubernetes-helm
  # Mac OS
  > brew install helm
  ```
### 2. Helm으로 젠킨스 설치
* 젠킨스를 실행할 네임스페이스를 생성한다.
  ```bash
  > kubectl create namespace jenkins
  ```
* 젠킨스 저장소를 추가하고 업데이트한다.
  ```bash
  > helm repo add jenkins https://charts.jenkins.io
  > helm repo update
  ```
* 아래의 명령어 수행 후 `jenkins-values.yaml` 파일에서 `serviceType`을 `NodePort`로 변경하고 외부에서 접근할 `Port`를 설정한다.
  ```
  > helm show values jenkins/jenkins > jenkins-values.yaml
  ```
* 변경된 파일로 젠킨스를 생성할 수 있도록 아래의 명령어를 수행한다.
  ```bash
  > helm install jenkins jenkins/jenkins --namespace jenkins -f jenkins-values.yaml
  ```
* 위에서 설정한 port 번호로 젠킨스 UI 접속을 확인한다.
* 아래의 명령어로 `admin` 계정의 패스워드를 확인 후 로그인한다.
  ```bash
  > kubectl exec --namespace jenkins -it svc/jenkins -c jenkins -- /bin/cat /run/secrets/additional/chart-admin-password && echo
  ```
## 웹훅(Webhook)
### 1. 웹훅(Webhook)
* 웹훅(Webhook)은 특정 이벤트가 발생했을 때 다른 서버나 애플리케이션으로 데이터를 전송하는 방법이다.
### 2. ssh 키 생성 및 설정
* 젠킨스 컨테이너에 접속해 SSH 키를 생성한다.
  ```bash
  > kubectl exec -it jenkins-0 -n jenkins -c jenkins -- /bin/bash
  > ssh-keygen -t ed25519 -C "<이메일 주소>"
  ```
* 생성한 SSH 공개키를 Git 저장소에 등록한다.
  * Github 저장소로 이동한다.
  * `Settings`에서 좌측 메뉴의 `Deploy keys`을 선택한다.
  * `Add deploy key` 버튼을 클릭하고 SSH 공개 키를 등록한다.
### 3. 젠킨스에 SSH 키 등록
* `Jenkins 관리` -> `Credentials` > `System의 global` > `Add Credentials` 클릭한다.
* `New credentials` 페이지에서 `kind`로 `SSH Username with private key`를 선택하고 내용을 작성한다.
  * `ID` 필드에 식별 가능한 ID를 작성한다.
  * `Username` 필드에 사용자 이름을 입력한다.
  * `Private Key` 항목에 `Enter directly`를 체크하고 SSH 개인 키를 복사하여 붙여 넣는다.
### 3. Github 웹훅 설정
* 웹훅을 설정할 Github 저장소로 이동한다.
* `Settings`에서 좌측 메뉴의 `Webhooks`을 선택한다.
* `Add webhook` 버튼을 클릭하고 새로운 웹훅을 설정한다.
* `Payload URL`에는 `http://젠킨스 주소/github-webhook/`를 입력한다.
* `Content type`에는 `application/json`를 선택해 주고 `Add webhook` 버튼을 클릭해 웹훅을 생성한다.
## 파이프라인(Pipeline)
### 1. 파이프라인(Pipeline)
* 파이프라인은 스크립트를 통해 소프트웨어 개발 프로세스를 자동화하는 한다. 
* 파이프라인은 소프트웨어의 빌드, 테스트, 배포하는 프로세스 전체를 관리하는 스크립트이다.
### 2. 파이프라인 스크립트 작성
* 젠킨스에서 제공하는 표준화된 `선언형 파이프라인(Declarative Pipeline)`을 사용하여 스크립트를 작성한다.
* 파이프라인 스크립트의 기본 구조는 아래와 같다.
  ```groovy
  // 선언형 파이프라인의 최상위 블록
  pipeline {
    agent any
    options {
      // 추가 옵션 설정
    }
    environment {
      // 환경 변수를 설정
    }
    stages {
      stage('Build') {
        steps {
          // 단계에서 실행될 작업
        }
      }
      stage('Test') {
        steps {
          // 단계에서 실행될 작업
        }
      }
      stage('Deploy') {
        steps {
          // 단계에서 실행될 작업
        }
      }
    }
    post {
      always {
        // 모든 빌드 결과에 실행될 작업
      }
      success {
        // 빌드 성공 시 실행될 작업
      }
      failure {
        // 빌드 실패 시 실행될 작업
      }
    }
  }
  ```
## 소나큐브(SonarQube)
### 1. 소나큐브(SonarQube)
* 소나큐브는 소프트웨어의 품질을 관리하고 코드를 분석하는 도구입니다. 
* 소나큐브는 코드 내의 버그, 보안 취약점, 중복 코드, 성능 문제 등을 찾아내고 이를 개선하는 방법을 제시한다.
### 2. Helm으로 소나큐브 설치
* 소나큐브를 실행할 네임스페이스를 생성한다.
  ```bash
  > kubectl create namespace sonarqube
  ```
* 소나큐브 저장소를 추가하고 업데이트한다.
  ```
  > helm repo add sonarqube https://SonarSource.github.io/helm-chart-sonarqube
  > helm repo update
  ```
* 아래의 명령어 수행 후 `sonarqube-values.yaml` 파일에서 `service.type`을 `NodePort`로 변경하고 외부에서 접근할 `Port`를 설정한다.
  ```
  > helm show values sonarqube/sonarqube > sonarqube-values.yaml
  ```
* 변경된 파일로 소나큐브를 생성할 수 있도록 아래의 명령어를 수행한다.
  ```bash
  > helm install sonarqube sonarqube/sonarqube --namespace sonarqube -f sonarqube-values.yaml
  ```
* 위에서 설정한 port 번호로 소나큐브 UI에 접속을 확인한다.
## 젠킨스와 연동
### 1. 소나큐브 토큰 생성
* 홈 화면에서 `Create Project` > `Create a local project` 선택한다.
* 프로젝트 정보 입력 후 `next`를 클릭한 뒤 다음 페이지에서 `Use the global setting` 선택 후 프로젝트를 생성한다.
* `계정 프로필` > `My Account` > `Security` > `Generate Tokens` 항목에서 소나큐브 토큰을 생성한다.
### 2. 플러그인 설치
* `Jenkins 관리` > `Plugins` > `Available plugins` > `SonarQube Scanner` 플러그인을 검색하여 설치한다.
### 3. Credentials 등록
* `Jenkins 관리` > `Credentials` > `Global` > `Add Credentials` 클릭한다.
* `New credentials` 페이지에서 `kind`로 `Secret Text`를 선택하고 내용을 작성한다.
  * `secret` 필드에 소나큐브에서 생성한 토큰을 입력한다.
  * `ID` 필드에 식별 가능한 ID를 작성한다.
### 4. 소나큐브 서버 등록
* `Jenkins 관리` > `System` > `Sonarqube Servers`에서 `Add SonarQube` 클릭한다.
  * `Name` 필드는 등록하려는 서버의 이름을 작성한다.
  * `Server URL`에는 `http://소나큐브 주소:9000`를 입력한다.
  * `Server authentication token`에는 위에서 등록한 Credentials을 선택한다.
