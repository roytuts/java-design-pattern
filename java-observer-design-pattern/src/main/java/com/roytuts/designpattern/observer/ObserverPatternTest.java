package com.roytuts.designpattern.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		Observer newsPaper = new NewsPaper();
		Observer internet = new Internet();
		Observer postCard = new PostCard();
		
		RecruitmentStatus serviceExam = new RecruitmentStatus("Clerk", "Railway Recruitment", "Exam to be held");
		
		serviceExam.registerObserver(postCard);
		serviceExam.registerObserver(newsPaper);
		serviceExam.registerObserver(internet);
		serviceExam.setStatus("Face to Face interview date needs to be scheduled");
	}

}
