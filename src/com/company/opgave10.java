package com.company;

import java.util.ArrayList;

public class opgave10 {
    public static void main(String[] args) {
        Election e = new Election();
        System.out.println(e.getTotalVotes());
        ArrayList<Candidate> Candidates = e.getCandidatesFromParty("red");

        for (Candidate candidate : Candidates) {
            System.out.println(candidate);
        }
        System.out.println(e.calculateVotepercentage("blue"));
    }

}
class Candidate{
    String name;
    String party;
    int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes){
        this.party = party;
        this.name = name;
        this.numberOfVotes = numberOfVotes;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getParty() {
        return party;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", party='" + party + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
class Election{
    public Election(){

    }

    public ArrayList<Candidate> list(){
        ArrayList<Candidate> Candidates = new ArrayList<>();
        Candidates.add(new Candidate("a","blue",20));
        Candidates.add(new Candidate("b","red",20));
        Candidates.add(new Candidate("c","red",20));
        Candidates.add(new Candidate("d","red",20));
        Candidates.add(new Candidate("e","blue",20));
        Candidates.add(new Candidate("f","blue",20));
        return Candidates;
    }
    public double getTotalVotes(){
        double total = 0;
        ArrayList<Candidate> Candidates;
        Candidates = list();
        for (Candidate candidate : Candidates) {
            total = total + candidate.getNumberOfVotes();
        }
        return total;
    }
    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> Candidates;
        ArrayList<Candidate> Party  = new ArrayList<>();
        Candidates = list();

        for (Candidate candidate : Candidates) {
            if (candidate.getParty().equals(party)) {
                Party.add(candidate);
            }
        }
        return Party;
    }

    public double calculateVotepercentage(String party){
        double total = getTotalVotes();
        int partyTotal = 0;
        ArrayList<Candidate> Candidates = getCandidatesFromParty(party);
        for (Candidate candidates : Candidates){
            partyTotal = candidates.numberOfVotes + partyTotal;
        }
        double g = 100;
        double percentage = partyTotal/total * g;
        return percentage;
    }

}
