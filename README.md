나현이는 면접 깃허브를 만들고 나를 초대하여라.

# Github-Practice 깃허브 완전 정복하기!

## 👀 Issue
참고 자료 :  
https://hbase.tistory.com/211  
https://dev200ok.blogspot.com/2020/04/dev-github-issue-labels.html  
https://richone.tistory.com/26  
https://velog.io/@dlawjdgk0715/git-%EA%B9%83%ED%97%88%EB%B8%8C-%EC%A0%95%EB%A6%AC  

### 깃허브 label keyword	의미

bug	: 예기치 않은 문제 또는 의도하지 않은 동작(버그)   
documentation : 문서를 개선하거나 추가 할 필요가 있음  
duplicate	: 해당이슈 또는 PR이 기존에 있음  
enhancement	: 새로운 기능 요청  
good first issue	: 처음 기여해볼 사람에게 좋은 문제  
help wanted :	관리자가 문제 또는 PR 요청에 대한 도움을 원함  
invalid	: 이슈 또는 PR 요청이 더 이상 관련이 없음  
question	: 이슈 또는 풀 요청에 추가 정보가 필요함  
wontfix	: 문제 나 PR 요청에서 작업이 계속되지 않음  

## 📜 Commit Message 작성법
규칙에 맞는 좋은 커밋메시지를 작성해야 하는 이유  
- 팀원과의 소통  
- 편리한 과거의 기록 추적  

좋은 커밋 메시지 작성법
좋은 커밋 메시지를 작성하기 위해 사용하는 몇 가지 규칙에 대하여 알아보도록 하자

## 📧 좋은 커밋 메시지 작성법

### 1. 커밋 유형 지정(타입)

feat : 새로운 기능 추가  
fix : 버그 수정  
docs : 문서 수정  
style : 코드 formatting, 세미콜론(;) 누락, 코드 변경이 없는 경우  
refactor : 코드 리팩터링  
test : 테스트 코드, 리팩터링 테스트 코드 추가(프로덕션 코드 변경 X)  
chore : 빌드 업무 수정, 패키지 매니저 수정(프로덕션 코드 변경 X)  
design : CSS 등 사용자 UI 디자인 변경  
comment : 필요한 주석 추가 및 변경  
rename : 파일 혹은 폴더명을 수정하거나 옮기는 작업만인 경우  
remove : 파일을 삭제하는 작업만 수행한 경우  
!BREAKING CHANGE : 커다란 API 변경의 경우  
!HOTFIX : 급하게 치명적인 버그를 고쳐야 하는 경우  
 


### 2. 제목과 본문을 빈 행으로 분리  

여러 행으로 구성된 커밋 로그를 -m 스위치를 사용해서 입력하기는 어렵다.   
적합한 편집기를 사용하여 편집을 진행하여야 하는데[깃 커밋 에디터 사용법](https://richone.tistory.com/27) 해당 글을 참고하자  

### 3. 제목 행을 50자로 제한

강제로 제한하는 것은 아니고 읽기 쉽고 간결하게 표현하기 위한 경험에 의한 규칙이다.    

### 4. 제목 행의 첫 글자는 대문자로 시작

readme file modification X  
Readme file modification O  

### 5. 제목 행 끝에 마침표를 넣지 않는다

제목 행의 끝에는 마침표가 필요 없다.  
50자 규칙에 따르기 위해서라도 마침표를 넣는 것은 불필요한 공간 낭비이다.   

Open the door. X  
Open the door O  

### 6. 제목 행에 명령문을 사용한다  

"명령이나 설명하듯이 작성"  

네 방을 치운다 (Clean your room)  
문을 닫는다 (Close the door)  
쓰레기를 갖다 버린다 (Take out the trash)  

### 7. 본문은 72자마다 끊어 줄을 바꿔준다

### 8. 본문을 사용하여 변경 한 내용과 이유 설명(어떻게 보다는 무엇과 왜를 설명한다)

### 9. 검토자가 원래 문제가 무엇인지 이해한다고 가정하지 말고 확실하게 설명 추가

### 10. 자신의 코드가 직관적으로 바로 파악 할 수 있다고 생각하지 말자

### 11. 팀에서 정한 Commit 규칙을 따르자

<좋은 Git 커밋 메시지의 7가지 규칙>
제목과 본문을 한 줄 띄워 분리하기
제목은 영문 기준 50자 이내로
제목 첫 글자를 대문자로
제목 끝에 . 금지
제목은 명령조로
Github - 제목(이나 본문)에 이슈 번호 붙이기
본문은 영문 기준 72자마다 줄 바꾸기
본문은 어떻게보다 무엇을, 왜에 맞춰 작성하기
 

### <커밋 메시지 구조>
type: Subject

body

footer  

### 예시
<img src="https://blog.kakaocdn.net/dn/lzKzK/btriYItwHo2/na4ijYAgt4u7YrNSnfu1k1/img.png"/>
 



