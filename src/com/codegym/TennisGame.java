package com.codegym;

public class TennisGame {

    public static final int love = 0;
    public static final int fifteen = 1;
    public static final int thirty = 2;
    public static final int forty = 3;

    public static String getScore(int player1Score, int player2Score) {
        String score;
        boolean isPlayer1ScoreGreaterThan3 = player1Score > 3;
        boolean isPlayer2ScoreGreaterThan3 = player2Score > 3;
        if (player1Score==player2Score) {
            score = getScoreWhenDeuce(player1Score);
        }
        else if (isPlayer1ScoreGreaterThan3 || isPlayer2ScoreGreaterThan3) {
                score = advantageOrWin(player1Score, player2Score);
        } else {
            score = getPoint(player1Score) + "-" + getPoint(player2Score);
        }
        return score;
    }

    private static String getScoreWhenDeuce(int player1Score) {
        switch (player1Score) {
            case love:
                return "Love-All";
            case fifteen:
                return "Fifteen-All";
            case thirty:
                return "Thirty-All";
            case forty:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    private static String advantageOrWin(int player1Score, int player2Score) {
        String score;
        int difference = player1Score - player2Score;
        if (difference == 1) score ="Advantage player1";
        else if (difference == -1) score ="Advantage player2";
        else if (difference >= 2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getPoint(int score) {
        switch(score) {
            case love:
                return  "Love";
            case fifteen:
                return "Fifteen";
            case thirty:
                return "Thirty";
            case forty:
                return "Forty";
            default:
                return "";
        }
    }
}