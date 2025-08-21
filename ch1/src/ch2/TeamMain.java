package ch2;

public class TeamMain {
    public static void main(String[] args) {
        Team team1 = new Team(1L, "team1");

        TeamMember member1 = new TeamMember(1L, "홍길동");
        TeamMember member2 = new TeamMember(2L, "성춘향");

        member1.setTeam(team1);
        member2.setTeam(team1);

        System.out.println(member1);

        System.out.println(member1.getTeam().getTeamName());
        team1.getList().add(member1);
    }
}
