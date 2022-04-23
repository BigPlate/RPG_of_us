package com.joo31775;

// Made by BigPlate
// Remake version
// 최적화는 최대한 한꺼번에 할 예정.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in); // 대사 분리를 위해 쓰입니다.
        String dummy_variable = inputReader.nextLine(); // 더미 변수
        int Player_max_hp = 100; // 최대체력 선언
        int Player_now_hp = 100; // 현재체력 선언
        int Player_atk = 0; // 공격력 선언
        String Player_story_line = "none"; // 스토리 라인 여기서 선언. 기본값 none.
        String Player_start_spot = "감자마을"; // 플레이어 캐릭터 고향 선언. 직업번호 1인 전사 기준으로 설정. 마을 이름엔 띄어쓰기 안하므로 주의.
        String Player_now_spot = "푸른 세계"; // 플레이어 캐릭터 위치 선언. 이스터에그같은 이스터에그
        String Player_whether_story_hearing_choice = "1"; // 스토리 들을건지 선택하는 변수. 기본값은 1
        boolean Player_whether_story_hearing_boolean = true; // 그래서 스토리 들을건지 안들을건지는 이걸로 판단. 기본값는 듣는 것으로 함.
        boolean Player_whether_story_hearing_chose = false; // 스토리 들을거지 안들을건지 제대로 선택했는지는 이걸로 판단. 기본값은 false.
        int Player_money_coin = 0; // 플레이어 소유 돈[코인] 선언. 기본값은 0.
        String Player_nickname = ""; // 플레이어 닉네임 선언. 기본값은 공백

        System.out.println("우리의 RPG에 온 것을 환영합니다."); // 판에박힌환영대사
        System.out.println("게임을 시작하기 전에 화면을 12줄 + 입력라인 1줄로 맞춰주세요.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("원하는 별명을 입력해서 진행");
        Player_nickname = inputReader.nextLine(); // 판에박힌환영대사 끝

        System.out.println("[ "+ Player_nickname +" ]님이군요!"); // 별명칭찬타임
        System.out.println("무슨뜻인지는 모르지만, 좋은 이름인거 같아요!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("아무것이나 입력해서 진행");
        dummy_variable = inputReader.nextLine(); // 별명칭찬타임 끝

        String Player_role_number = "0"; // 판에박힌직업선택
        String Player_role_name = "미정";
        while (Player_role_name.equals("미정")) {
            System.out.println("이제 직업을 선택할 차례입니다.");
            System.out.println("전사와 마법사 중 원하는 직업을 선택해주세요.");
            System.out.println("선택지 외의 숫자를 입력하면 진행되지 않습니다.");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("1을 입력해서 최대체력 100과 기본공격력 30을 가진 전사를 선택");
            System.out.println("2를 입력해서 최대체력 80과 기본공격력 40을 가진 마법사를 선택");
            Player_role_number = inputReader.nextLine();
            if (Player_role_number.equals("1")) { // 제대로 입력했다면?
                Player_role_name = "전사";
                Player_max_hp = 100; // 최대체력 설정
                Player_now_hp = 100; // 현재체력 설정
                Player_atk = 30; // 공격력 설정
                Player_start_spot = "감자마을"; // 플레이어 캐릭터 고향 선언
                Player_now_spot = "감자마을"; // 플레이어 캐릭터 위치 선언
                Player_story_line = "po-1"; // 플레이어 스토리라인 선언
            } else if (Player_role_number.equals("2")) {
                Player_role_name = "마법사";
                Player_max_hp = 80; // 최대체력 설정
                Player_now_hp = 80; // 현재체력 설정
                Player_atk = 40; // 공격력 설정
                Player_start_spot = "감자마을"; // 플레이어 캐릭터 고향 선언
                Player_now_spot = "감자마을"; // 플레이어 캐릭터 위치 선언
                Player_story_line = "po-2"; // 플레이어 스토리라인 선언
            }


        } // 판에박힌직업선택 끝

        // 스토리 들을건지 물어보는 곳
        while (Player_whether_story_hearing_chose = false) {
            System.out.println("[ " + Player_role_name + " ]" + "로 전직하였습니다."); // 알겠고 스토리는 들으실?
            System.out.println("이제 게임을 시작할 체례입니다.");
            System.out.println("본인 직업에 대한 스토리를 듣고 싶으신가요?");
            System.out.println("들어본 적이 한번도 없다면 스킵하지 말아주세요(중요함).");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("0을 입력해서 스토리 스킵하기");
            System.out.println("1을 입력해서 스토리 듣기");
            Player_whether_story_hearing_choice = inputReader.nextLine(); // 들을거임?
            if (Player_whether_story_hearing_choice == "0") {
                Player_whether_story_hearing_boolean = false;
                Player_whether_story_hearing_chose = true;
            } else if (Player_whether_story_hearing_choice == "1") {
                Player_whether_story_hearing_boolean = true;
                Player_whether_story_hearing_chose = true;
            }
        }

        // 장대한 스토리 (를 준비중)
        while (true) {
            if (Player_story_line == "po-1") { // 전사 스토리
                break;
            }
            else if (Player_story_line == "po-2") { // 마법사 스토리
                break;
            }
            else if (Player_story_line == "co-1") { // 궁수 스토리
                break;
            }
            else if (Player_story_line == "co-2") { // 마법사 스토리
                break;
            }
        }

        // 스토리 체킹구역 끝

        System.out.println("[ 위치 : " + Player_now_spot + " ]"+"[ 소유한 코인 : " + Player_money_coin + "코인]");
        System.out.println("[ 이름 : " + Player_nickname + "]"+"[ 직업 : " + Player_role_name + " ]:");
        System.out.println("< 공격력 : " + Player_atk + " > < 현재 체력 : "+Player_now_hp + " / " +Player_max_hp+ " >");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        dummy_variable = inputReader.nextLine();
    }
}
