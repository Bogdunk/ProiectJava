package com.company;

public class Task {
    public String [] taskuri;
    //public com.company.echipa [] team_tasks;

    public Task( String [] taskuri ){
        this.taskuri = taskuri;
        //team_tasks = tasks_team;
    }

    public void arata_task_parcele( com.company.echipa team ){
        System.out.println( "Echipa cu id-ul " + team.getId_echipa() + " are de efectuat urmatoarele treburi:");
        for( int i=0; i< taskuri.length;  i++ )
            System.out.println( taskuri[i] );
    }

    public String getTaskuri() {
        String TASK = "";
        for( int i=0; i<taskuri.length; i++ ) {
            TASK = TASK + " " + taskuri[i];
        }
        return TASK;
    }
}
