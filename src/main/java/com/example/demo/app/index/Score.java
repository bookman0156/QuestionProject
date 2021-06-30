package com.example.demo.app.index;

import java.util.List;

public class Score {
	
	//
	// 各問題の得点計算
	//
	public int getScore(int question_num, AnswerForm user_answer, List<Question> question_answer, String type) {
		
		int score = 0;
		for(int i=0; i < question_num; i++)
		{
			Question java = question_answer.get(i);
			String str = java.getAnswer();
			if(str.equals(user_answer.getSelect(i,type )))
				score += 1;
		}
		return score;
	}
}
