## 쿠버네티스(Kubernetes) 
### 1. 쿠버네티스(Kubernetes)란?
* 쿠버네티스는 그리스어로 조타수라는 뜻으로 컨테이너 오케스트레이션 도구이다.
* 구글이 2014년 오픈 소스화했고 사실상 표준으로 사용되고 있으며 많은 회사에서 쿠버네티스를 운영에 도입해 사용하고 있다.
* 쿠버네티스는 K8s라는 표기를 사용하기도 하는데 쿠버네티스에서(Kubernetes)에서 K와 s 사이에 8글자를 나타내는 약식 표기이다.
* 쿠버네티스는 여러 대의 서버(호스트)를 하나의 클러스터로 만들어준다는 장점과 타 오케스트레이션 도구와 비교해 세부적인 기능을 더욱 폭넓게 제공한다.
### 2. 쿠버네티스의 장점
* 쿠버네티스는 여러 대의 서버를 하나의 클러스터로 만들어 준다
* 마이크로 서비스 구조의 컨테이너 배포, 서비스 장애 복구 등 컨테이너 기반의 서비스 운영에 필요한 대부분의 오케스트레이션 기능을 폭넓게 지원한다. 
### 3. 쿠버네티스의 단점
* 쿠버네티스는 구조가 훨씬 복잡하고 사용 방법이 다양하기 때문에 학습 비용이 높다.
* 일정한 규모 이상의 서비스를 제공하는 회사에서는 안정적이고 효율적인 서비스를 제공할 수 있지만, 소규모 조직 및 회사에서는 쿠버네티스의 기능을 배우고 관리하는 것이 문제가 될 수 있다. (오버 엔지니어링)
* 운영하는 서비스가 쿠버네티스에 적합한지, 쿠버네티스를 운영하고 관리하기 위한 인력이나 비용이 충분한지 검토하고 쿠버네티스를 적용해야 한다.
### 4. 쿠버네티스의 특징
* 쿠버네티스의 모든 리소스는 오브젝트 형태로 관리한다.
* 선언형 설정이다. 모든 리소스 오브젝트는 특별한 경우가 아니면 대부분 YAML 파일로 작성된다.
* 쿠버네티스는 여러 개의 컴포넌트로 구성된다.
## 쿠버네티스(Kubernetes) 설치
### 1. 쿠버네티스 설치 
* 도커와 달리 쿠버네티스는 사용 환경과 목적에 따라 설치하는 방법이 매우 다양하고 복잡하다.
* 목적에 따른 분류
  * 개발 용도 : Minikube, Docker Desktop 내장 쿠버네티스
  * 서비스 테스트 및 운영 용도 : Kops, Kubespray, Kubeadm, EKS, GKE 등
* 환경에 따른 분류
  * 자체 서버 환경 (on-premise 환경) : Kubespray, Kubeadm
  * 클라우드 서버 인프라 환경 : Kops, Kubespray, Kubeadm
  * 클라우드 서비스 환경 : EKS, GKE 등
* 개발 용도로 로컬에서 사용하려면 별도의 어려움 없이 쉽게 설치할 수 있지만 운영 단계의 쿠버네티스 클러스터를 구축하려면 수십 개의 서버에 동시에 쿠버네티스를 설치해서 관리해야 한다.
### 2. 설치 확인
* 설치 후 kubectl version 명령어로 설치한 쿠버네티스의 버전을 확인한다.
  ``` bash
  > kubectl version
  > kubectl version --output='json'
  > kubectl version --output='yaml'
  ``` 
## Pod
### 1. Pod
* 쿠버네티스에서 컨테이너 애플리케이션의 기본 단위를 포드라(Pod)라고 부른다.
* 포드는 1개 이상의 컨테이너로 구성된 오브젝트이다.
### 2. Pod 생성
* Pod 생성을 위한 YAML 파일 작성
    ```yaml
    apiVersion: v1
    kind: Pod
    metadata:
      name: <포드 이름>
    spec:
      containers:
      - name: <컨테이너 이름>
        image: <기본 이미지>
        ports:
        - containerPort: <컨테이너가 노출할 Port>
    ```
* 작성한 YAML 파일은 ```kubectl apply -f <파일명>``` 명령어로 쿠버네티스에서 Pod를 생성할 수 있다. 
### 3. Pod 목록 조회
* Pod의 목록을 확인하기 위해 ```kubectl get pods``` 또는 ```kubectl get po``` 명령어를 사용한다.
### 4. Pod 상세 정보 조회
* ```kubectl describe pods <포드 이름>``` 명령어를 사용하면 생성된 리소스의 자세한 정보를 얻어올 수 있다.
### 5. Pod의 컨테이너에서 명령어 실행
* 쿠버네티스에서도 ```kubectl exec``` 명령으로 포드의 컨테이너에 명령어를 전달할 수 있다.
### 6. Pod의 로그 확인
* 쿠버네티스에서도 ```kubectl logs``` 명령어로 포드의 로그를 확인할 수 있다.
* 하나의 포드에 여러 개의 컨테이너가 존재한다면 -c 옵션을 이용해서 명령어를 수행할 컨테이너를 지정할 수 있다.
### 6. Pod 삭제
* ```kubectl delete``` 명령어로 Pod를 삭제할 수 있다. 
  ```bash
  > kubectl delete pod <포드 이름>
  > kubectl delete -f <파일명>
  ```
## Replica Set
### 1. Replica Set
* 레플리카셋은 정해진 수의 동일한 포드가 항상 실행되도록 관리하는 역할을 하는 오브젝트이다.
* 노드 장애 등의 이유로 포드를 사용할 수 없다면 다른 노드에서 포드를 다시 생성한다. 
### 2. Replica Set 생성
* Replica Set 생성을 위한 YAML 파일 작성
  ```yaml
  apiVersion: apps/v1
  kind: ReplicaSet
  metadata: 
    name: <레플리카셋 이름>
  spec:
    replicas: <Pod 유지 개수>
    selector:
      matchLabels:
        app: <관리할 Pod를 찾는 선택기>
    template:
      metadata:
        name: <포드 이름>
        labels:
          app: <레플리카셋의 matchLabels의 항목과 동일하게 작성>
      spec:
        containers:
        - name: <컨테이너 이름>
          image: <기본 이미지>
          ports:
          - containerPort: <컨테이너가 노출할 Port>
  ```
* 작성한 YAML 파일은 ```kubectl apply -f <파일명>``` 명령어로 쿠버네티스에서 Replica Set을 생성할 수 있다. 
* Replica Set을 생성하면 replicas에 지정한 개수만큼 Pod도 함께 생성된다.
### 3. Replica Set 목록 조회
* Replica Set의 목록을 확인하기 위해 ```kubectl get replicasets``` 또는 ```kubectl get rs``` 명령어를 사용한다.
### 4. Replica Set 상세 정보 조회
* ```kubectl describe replicasets <레플리카셋 이름>``` 명령어를 사용하면 생성된 리소스의 자세한 정보를 얻어올 수 있다.
### 5. Replica Set 수정
* 생성된 레플리카셋에 정의된 포드의 개수를 변경하려면 생성된 레플리카셋을 삭제하고 다시 생성할 필요가 없다.
* ```kubectl edit```, ```kubectl patch``` 명령어를 사용하거나 YAML 파일을 수정해서 ```kubectl apply -f``` 명령어로 YAML 파일을 읽어 기존 Replica Set을 수정할 수 있다.
### 6. Replica Set 삭제
* ```kubectl delete``` 명령어로 Replica Set을 삭제할 수 있다. 
  ```bash
  > kubectl delete rs <레플리카셋 이름>
  > kubectl delete -f <파일명>
  ```
* ReplicaSet에 의해 생성된 Pod도 같이 삭제된다.
## Deployment
### 1. Deployment
* Deployment는 여러 개의 Replica Set을 관리하기 위한 상위 오브젝트로 컨테이너 애플리케이션을 배포하고 관리하는 역할을 담당한다.
* 애플리케이션을 업데이트할 때 Replica Set의 변경 사항을 저장하는 리비전(Revision)을 남겨 롤백을 가능하고 무중단 서비스를 위해 포드의 롤링 업데이트 전략을 사용한다.
* 디플로이먼트를 사용하면 이러한 장점이 있기 때문에 쿠버네티스에서도 공식적으로 디플로이먼트를 사용할 것을 권장하고 있다.
### 2. Deployment 생성
* Deployment 생성을 위한 YAML 파일 작성
  ```yaml
  apiVersion: apps/v1
  kind: Deployment
  metadata: 
    name: <디플로이먼트 이름>
  spec:
    replicas: <Pod 유지 개수>
    selector:
      matchLabels:
        app: <관리할 Pod를 찾는 선택기>
    template:
      metadata:
        name: <포드 이름>
        labels:
          app: <레플리카셋의 matchLabels의 항목과 동일하게 작성>
      spec:
        containers:
        - name: <컨테이너 이름>
          image: <기본 이미지>
          ports:
          - containerPort: <컨테이너가 노출할 Port>
  ```
* Replica Set의 YAML 파일에서 kind 항목이 Deployment로 바뀌었을 뿐 변경된 부분은 거의 없다.
* 작성한 YAML 파일은 ```kubectl apply -f <파일명>``` 명령어로 쿠버네티스에서 Deployment을 생성할 수 있다. 
* Deployment와 함께 Replica Set, Pod도 함께 생성된다.
### 2. Deployment 목록 조회
* Deployment의 목록을 확인하기 위해 ```kubectl get deployment``` 또는 ```kubectl get deploy``` 명령어를 사용한다.
### 3. Deployment 상세 정보 조회
* ```kubectl describe deploy <디플로이먼트 이름>``` 명령어를 사용하면 생성된 리소스의 자세한 정보를 얻어올 수 있다.
### 4. Deployment 업데이트
* 이미지 업데이트
  * 포드의 이미지를 변경하는 경우 ```kubectl set image deploy <Deployment 이름> <컨테이너 이름>=<이미지 이름> --record=true``` 명령어를 사용한다.
  * --recode=true 옵션으로 디플로이먼트를 변경하면 변경 사항을 Deployment에 기록한다.
  * ```kubectl set image``` 명령어 대신 YAML 파일에서 직접 image 항목을 변경한 다음 ```kubectl apply -f``` 명령어로 적용해도 동일하게 변경된다.
* Deployment 롤백
  * ```kubectl rollout history deploy [Deployment 이름] [옵션]``` 명령어로 Deployment의 변경 사항을 조회할 수 있다.
  * ```kubectl rollout undo deploy <deploy 이름> [--to-revision=번호]``` 명령어로 이전 버전의 레플리카셋으로 롤백할 수 있다.
  * --to-revision을 생략하면 바로 이전 버전으로 롤백한다.
### 5. Deployment 삭제
* ```kubectl delete``` 명령어로 Deployment을 삭제할 수 있다. 
  ```bash
  > kubectl delete deploy <디플로이먼트 이름>
  > kubectl delete -f <파일명>
  ```
* Deployment에 의해 생성된 Replica Set, Pod도 같이 삭제된다.
## Service 
### 1. Service 
* 포드를 외부에 노출해 사용자들이 접근하거나, 다른 디플로이먼트의 포드들이 내부적으로 접근하려면 Service(Service)라고 부르는 별도의 쿠버네티스 오브젝트를 생성해야 한다.
* Service는 쿠버네티스에서 애플리케이션을 배포하기 위해서는 반드시 알아야 할 오브젝트이다.
### 2. Service의 특징
* 여러 개의 포드에 쉽게 접근할 수 있도록 고유한 도메인 이름을 부여한다.
* 여러 개의 포드에 접근할 때, 요청을 분산하는 로드 밸런서 기능을 수행한다.
* 클라우드 플랫폼의 로드 밸런서, 클러스터 노드의 포트 등을 통해 포드를 외부로 노출한다.
### 3. Service의 종류
* ClusterIP Type
  * 쿠버네티스 내부에서만 포드들에 접근할 때 사용합니다. 
  * 외부로 포드를 노출하지 않기 때문에 쿠버네티스 클러스터 내부에서만 사용되는 포드에 적합하다.
  * Service의 내부 IP 또는  Service의 이름으로 포드에 접근할 수 있다.
* NodePort Type
  * 포드에 접근할 수 있는 포트를 클러스터의 모든 노드에 동일하게 개방합니다. 따라서 외부에서 포드에 접근할 수 있는 Service 타입이다. 
  * 접근할 수 있는 포트는 랜덤으로 정해지지만, 특정 포트로 접근하도록 설정할 수도 있다.
  * NodePort 타입의  Service가 ClusterIP의 기능을 포함하기 있기 때문에 NodePort 타입의  Service를 생성하면 자동으로 ClusterIP의 기능을 사용할 수 있다.
* LoadBalancer Type
  * 클라우드 플랫폼에서 제공하는 로드 밸런서를 동적으로 프로비저닝해 포드에 연결한다. 
  * NodePort 타입과 마찬가지로 외부에서 포드에 접근할 수 있는 Service 타입이다. 
  * AWS, GCP 등과 같은 클라우드 플랫폼 환경에서만 사용할 수 있다.
### 4. Service 생성
* Service 생성을 위한 YAML 파일 작성
  ```yaml
  apiVersion: v1
  kind: Service
  metadata: 
    name: <서비스 이름>
  spec:
    type: <Service Type>
    selector:
      app: <Pod 선택기>
    ports:
    - name: <Port 이름>
      port: <서비스의 Port>
      targetPort: <Pod에서 사용중인 Port>
      nodePort: <외부에서 연결할 Port 지정>

  ```
* 작성한 YAML 파일은 ``` kubectl apply -f <파일명>``` 명령어로 쿠버네티스에서 Service를 생성할 수 있다. 
### 5. Service 목록 조회
* Service의 목록을 확인하기 위해 ```kubectl get services``` 또는 ```kubectl get svc``` 명령어를 사용한다.
### 6. Service 삭제
* Service를 삭제하려면``` kubectl delete``` 명령어를 사용한다.
  ```
  > kubectl delete svc <서비스 이름>
  > kubectl delete -f <파일명>
  ```
## Volume
### 1. Volume
* 쿠버네티스에서도 호스트에 위치한 디렉터리를 각 포드와 공유함으로써 데이터를 보존할 수 있다.
* 또한 어느 노드에서도 접근해 사용할 수 있는 퍼시스턴트 볼륨(Persistent Volume)을 사용할 수 있다.
### 2. 로컬 볼륨
* emptyDir는 pod가 실행되는 도중에만 필요한 휘발성 데이터를 각 컨테이너가 함께 사용할 수 있도록 임시 저장하는 공간을 생성한다.
  ```yaml
  apiVersion: v1
  kind: Pod
  metadata:
    name: <포드 이름>
  spec:
    containers:
    - name: <컨테이너 이름>
      image: <기본 이미지>
      volumeMounts: 
      - mountPath: <컨테이너 경로>
        name: <볼륨 이름>
    volumes: 
    - name: <볼륨 이름>
      emptyDir: {}
  ```
* hostPath는 호스트의 디렉터리를 pod와 공유해 데이터를 저장한다.
  ```yaml
  apiVersion: v1
  kind: Pod
  metadata:
    name: <포드 이름>
  spec:
    containers:
    - name: <컨테이너 이름>
      image: <기본 이미지>
      volumeMounts: 
      - mountPath: <컨테이너 경로>
        name: <볼륨 이름>
    volumes: 
    - name: <볼륨 이름>
      hostPath: 
        path: <호스트 경로>  
  ```
### 3. 퍼시스턴트 볼륨(Persistent Volume)과 퍼시스턴트 볼륨 클레임(Persistent Volume Claim)
* 퍼시스턴트 볼륨(Persistent Volume)은 볼륨 자체를 말하고 클러스터 안에서 자원으로 다룬다. 
  ```yaml
  apiVersion: v1
  kind: PersistentVolume
  metadata:
    name: <퍼시스턴트 볼륨 이름>
  spec:
    capacity:
      storage: <볼륨 용량>
    volumeMode: <볼륨 모드>
    accessModes:
      - <읽기/쓰기 옵션>
    hostPath:
      path: <호스트 경로>
  ```
* 퍼시스턴트 볼륨 클레임(Persistent Volume Claim)은 퍼시스턴트 볼륨(Persistent Volume)에서 사용하고 싶은 용량은 얼마인지, 읽기/쓰기는 어떤 모드로 설정하고 싶은지 등을 정해서 요청한다.
  ```yaml
  apiVersion: v1
  kind: PersistentVolumeClaim
  metadata:
    name: <퍼시스턴트 볼륨 클레임 이름>
  spec:
    accessModes:
    - <읽기/쓰기 옵션>
    volumeMode: <볼륨 모드>
    resources:
      requests:
        storage: <볼륨 용량>
  ```
* 퍼시스턴트 볼륨과 퍼시스턴트 볼륨 클레임의 목록을 확인하기 위해 ```kubectl get pv```, ```kubectl get pvc``` 명령어를 사용한다.
* Pod에서 퍼시스턴트 볼륨 클레임을 볼륨으로 사용하려면 아래와 같이 Pod 템플릿을 작성해야 한다.
  ```yaml
  # 위의 내용은 생략
    volumeMounts:
    - mountPath: <컨테이너 경로>
      name: <볼륨 이름>
  volumes:
  - name: <볼륨 이름>
    persistentVolumeClaim:
      claimName: <퍼시스턴트 볼륨 클레임 이름>
  ```
## ConfigMap & Secret
### 1. ConfigMap
* ConfigMap은 일반적인 설정값을 담아 저장할 수 있는 쿠버네티스 오브젝트이다.
* ConfigMap 생성을 위한 YAML 파일 작성
  ```yaml
  apiVersion: v1
  kind: ConfigMap
  metadata:
    name: <ConfigMap 이름>
  data:
    DB_URL : <설정 값>
    DB_USER : <설정 값>
  ```
### 2. Secret
* Secret은 SSH 키, 비밀번호 등과 같이 민감한 정보를 저장할 수 있는 쿠버네티스 오브젝트이다.
* ConfigMap 생성을 위한 YAML 파일 작성
  ```yaml
  apiVersion: v1
  kind: Secret
  metadata:
    name: <Secret 이름>
  data: 
    ROOT_PASSWORD: <Base64로 인코딩이 된 문자열>
  ```
### 3. ConfigMap과 Secret 사용하기
* ConfigMap과 Secret을 통해 애플리케이션에 필요한 설정값을 전달할 수 있다.
  ```yaml
  apiVersion: v1
    kind: Pod
    metadata:
      name: <포드 이름>
    spec:
      containers:
      - name: <컨테이너 이름>
        image: <기본 이미지>
        ports:
        - containerPort: <컨테이너가 노출할 Port>
        env:
        - name: <환경변수 이름>
          valueFrom:
            configMapKeyRef:
              name: <ConfigMap 이름>
              key: <ConfigMap 키>
        - name : <환경변수 이름>
          valueFrom:
            secretKeyRef:
              name: <Secret 이름>
              key: <Secret 키>
  ```
