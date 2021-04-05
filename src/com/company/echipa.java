package com.company;

public class echipa {
    private int id_echipa;
    private com.company.Angajat [] team;

    public echipa(int id_echipa, com.company.Angajat [] Team){
        this.id_echipa = id_echipa;
        team = Team;
    }

    public void show_the_team(){
        System.out.println("Echipa cu id-ul " + this.id_echipa + " este formata din urmatorii lucratori:");
        for( int i=0; i<team.length; i++ ){
            team[i].arata_angajat();
            System.out.println();
        }
    }

    public int getId_echipa(){
        return id_echipa;
    }

}
