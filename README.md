# hhr_payStyle

2023-01-27~2023-02-17 프로젝트 기능구현  
2023-02-28 화면에 안나온 chart.js가 있어서 수정  
2023-04-03 내 깃허브에 일단 hhr_test_branch에 push 함.  
첫날에 대략적인 구조를 텍스트로 작성. 내가 만든 간단한 회원가입과 로그인 위에 각자 페이지 별로 작성하기로 함.  

Springboot maven    
  
가계부, 도서관, 쇼핑 등등이 나옴. 뭔가 너무 어렵지 않으면서 다른 조와 겹치지 않아야 할 것 같다는 의견이 나옴.  
그래서 가계부로 정함.  

아쉬운 점  

1. JavaScript로 직접 달력을 만들어 사용 : Fullcalendar 캘린더 라이브러리를 이용하면 더 많은 기능을 손쉽게 구현할 수 있다.  

2. querydsl-jpa와 spring-data의 Specification:  

    페이징도 동시에 해결하려고 Specification를 사용했으나 복잡한 쿼리문에서 가시성이 많이 떨어지게 되는 문제 때문에 사용을 지양해야 함.  

3. 어떤 기능을 어떤 라이브러리를 써서 어떠한 방식으로 할지 잘 몰랐음.  

4. 참고 사이트를 따라하기에 급급했음.  

5. 다들 깃허브나 깃 사용 할 줄 몰라서 한 사람 파일을 기준으로 일일이 손으로 복사 붙여넣기 해서 프로젝트를 완성시킴. 노션이라도 있는지 물어볼걸.  

----------------   

 테이블구조  
 
<img src="./payStyle 테이블구조.png" width="600px" height="300px" title="Github_Logo"></img>  
