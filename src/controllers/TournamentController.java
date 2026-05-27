package controllers;

import models.Tournament;

public class TournamentController {

  public TournamentController sortSelectionDes(Tournament[] tournaments){
    int n = tournaments.length;
    for(int i =0;i<n-1;i++){
      int midIndex= i;
      for(int j=i+1;j<n;j++){
        if (tournaments[i].getTotalStarterPoints()<tournaments[midIndex].getTotalStarterPoints()){
          midIndex = j;
        }

      }
      Tournament temp = tournaments[midIndex];
      tournaments [midIndex] = tournaments[i];
      tournaments [i] = temp;

    }
    return tournaments;
  }
  //public Tournament binarySearchByTotalStarterPointsFilaB(Tournament[] tournaments, int totalStarterPoints){
    //int low =0; int high= tournaments.length-1;
    //boolean Desc 
    //while (condition) {
      
    //}






  //}
  public void printlnTournament(Tournament[] tournaments){

    for(Tournament t : tournaments){
      System.out.println(t);

    }
  }
  
}
