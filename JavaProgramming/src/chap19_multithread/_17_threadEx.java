package chap19_multithread;

import chap19_multithread.clazz.BoardDAO;

public class _17_threadEx {
    public static void main(String[] args) {
        BoardDAO boardDAO = new BoardDAO();
              boardDAO .selectBoardList();
        //최대 스레드의 개수가 100인 스레드풀을 생성
        //풀에 생성된 스레드를 사용해서 사용자에게 하나씩 대여해서 사용자가
        //요청한 작업을 처리하게된다
        //사용자가 요청한 작업이 끝나면 다시 스레드를 반납받아서
        //대기중인 사용자에게 다시대여
        //100명까지의 사용자 요청만 동시에 처리하고
        //먼저끝난 작업이 있으면 대기하고있는 사용자에게 반납받은 스레드
        //다시대여(1~100
        //다시대여(2~101)


    }

};
        //아래 방식은 스레드가 기하급수적으로 생성되기 떄문에
        //많은 사용자가 접속하면 서버에 과부하가 발생한다.
        //원하는 최대 스레드의 개수를 지정해서 스레드풀로 관리.
//        Thread thread = new Thread() {
////            @Override
////            public void run() {
////                boardDAO .selectBoardList()
////            }
////        };

