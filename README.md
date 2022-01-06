# spring-boot-kafka-example

### 실행방법

1. `docker-compose up -d` 명령어를 통해서 kafka와 zookeeper 컨테이너를 실행한다. 
2. producer와 consumer를 각각 실행시킨다.
3. 아래의 api를 통해 요청을 보낸다.
 
```aidl
Method : Get,
Url : http://localhost:8080/generate,
Parameter: message(string), age(int)
```
##### example
> http://localhost:8080/generate?message=message&age=3
