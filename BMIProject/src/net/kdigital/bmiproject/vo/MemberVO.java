package net.kdigital.bmiproject.vo;

public class MemberVO {
	private String id;
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private String bmiresult;

	public MemberVO(String id, String name, double height, double weight) {
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		bmiCalc();
	}
	
	private void bmiCalc() {
		double heightToM = height * 0.01;
		bmi = weight / (heightToM * heightToM);
		
		if (bmi >= 25) {
			bmiresult = "비만";
		}
		else if (bmi >= 23) {
			bmiresult = "과체중";
		}
		else if (bmi >= 18.5) {
			bmiresult = "정상";
		}
		else {
			bmiresult = "저체중";
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		bmiCalc(); //다시 계산
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		bmiCalc(); //다시 계산
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBMI() {
		return bmi;
	}

	public String getBMIResult() {
		return bmiresult;
	}

	@Override
	public String toString() {
		return String.format("아이디 : %s 이름 : %s%n"
				+ "키 : %.2fcm 몸무게 : %.2fkg%n"
				+ "BMI : %.2f 체질량 검사 결과 : %s%n", id, name, height, weight, bmi, bmiresult);
		
//		return "아이디 : " + id +  
//				"\n이름 : " + name + 
//				"\n키 : " + height + 
//				"\n몸무게 : " + weight + 
//				"\nBMI : " + bmi + 
//				"\n체질량 검사 결과 : " + bmiresult;
	} 
}
