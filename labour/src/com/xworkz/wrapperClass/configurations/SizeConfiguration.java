package com.xworkz.wrapperClass.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.wrapperClass")
public class SizeConfiguration {
	

	@Bean
	public Integer shirtSize(){
		System.out.println("register in shirtSize");
		return 34;
	}
	@Bean
	public Integer pantSize(){
		System.out.println("register in pantSize");
		return 32;
	}

	@Bean
	public Integer shortsSizes(){
		System.out.println("register in shortsSizes");
		return 44;
	}

	@Bean
	public Integer helmetSizes(){
		System.out.println("register in helmetSizes");
		return 25;
	}

	@Bean
	public Integer socksSizes(){
		System.out.println("register in socksSizes");
		return 6;
	}

	@Bean
	public Integer TshirtSizes(){
		System.out.println("register in TshirtSizes");
		return 44;
	}

	@Bean
	public Integer shoeSize(){
		System.out.println("register in shoeSize");
		return 12;
	}

	@Bean
	public Integer chappalSize(){
		System.out.println("register in chappalSize");
		return 8;
	}

	@Bean
	public Float cgpa() {
		System.out.println("Total CGPA");
		return 10.0f;
	}
	@Bean
	public Float cgpaOfAnnesh() {
		System.out.println("Annesh's CGPA");

		return 8.6f;
	}
	@Bean
	public Float cgpaOfRikesh() {
		System.out.println("Rikesh's CGPA");

		return 6.6f;
	}
	@Bean
	public Float cgpaOfBasavaraj() {
		System.out.println("Basavaraj's CGPA");
		return 7.6f;
	}
	@Bean
	public Float cgpaOfAnita() {
		System.out.println("Anits's CGPA");

		return 7.6f;
	}
	@Bean
	public Float cgpaOfAnkitha() {
		System.out.println("Ankitha's CGPA");

		return 9.6f;
	}
	@Bean
	public Float cgpaOfIrfan() {
		System.out.println("Irfan's CGPA");

		return 8.6f;
	}
	@Bean
	public Float cgpaOfShivu() {
		System.out.println("Shivu's CGPA");

		return 8.6f;
	}
	@Bean
	public Float cgpaOfSanketh() {
		System.out.println("Sanketh's CGPA");

		return 8.6f;
	}
	@Bean
	public Float cgpaOfBhairavi() {
		System.out.println("Bhairavi's CGPA");

		return 8.6f;
	}
	@Bean
	public Long phoneno() {
		System.out.println("running long in SpringConfiguration..");
		return 9966445536L;
	}

	@Bean
	public Long phoneno1() {
		System.out.println("running long in SpringConfiguration..");
		return 9966446636L;
	}

	@Bean
	public Long phoneno2() {
		System.out.println("running long in SpringConfiguration..");
		return 8866445536L;
	}

	@Bean
	public Long phoneno3() {
		System.out.println("running long in SpringConfiguration..");
		return 9933885536L;
	}

	@Bean
	public Long phoneno4() {
		System.out.println("running long in SpringConfiguration..");
		return 9966445369L;
	}

	@Bean

	public long phoneno5() {
		System.out.println("running long in SpringConfiguration..");
		return 9961295536L;
	}

	@Bean

	public Long phoneno6() {
		System.out.println("running long in SpringConfiguration..");
		return 8615445536L;
	}

	@Bean

	public Long phoneno7() {
		System.out.println("running long in SpringConfiguration..");
		return 986445536L;
	}

	@Bean
	public Long phoneno8() {
		System.out.println("running long in SpringConfiguration..");
		return 3496445536L;
	}

	@Bean
	public short price() {
		System.out.println("running short in SpringConfiguration..");
		return 5561;
	}

	@Bean
	public short price1() {
		System.out.println("running short in SpringConfiguration..");
		return 30000;
	}

	@Bean
	public short price2() {
		System.out.println("running short in SpringConfiguration..");
		return 4000;
	}

	@Bean
	public short price3() {
		System.out.println("running short in SpringConfiguration..");
		return 9500;
	}

	@Bean
	public short price4() {
		System.out.println("running short in SpringConfiguration..");
		return 3596;
	}

	@Bean
	public short price5() {
		System.out.println("running short in SpringConfiguration..");
		return 9865;
	}

	@Bean
	public short price6() {
		System.out.println("running short in SpringConfiguration..");
		return 6000;
	}

	@Bean
	public short price7() {
		System.out.println("running short in SpringConfiguration..");
		return 3600;
	}

	@Bean
	public short price8() {
		System.out.println("running short in SpringConfiguration..");
		return 9896;
	
	}
	@Bean
	public Double temp1() {
		System.out.println("running method in temp");
		return 12.5;
	}
	@Bean
	public Double temp2() {
		System.out.println("running method in temp");
		return 12.5;
	}
	@Bean
	public Double temp3() {
		System.out.println("running method in temp");
		return 12.5; 
	}
	@Bean
	public Double temp4() {
		System.out.println("running method in temp");
		return 12.5;
	}
	@Bean
	public Double temp5() {
		System.out.println("running method in temp");
		return 12.5;
	}
	@Bean
	public Double temp6() {
		System.out.println("running method in temp");
		return 12.5;
	}
	@Bean
	public Double temp7() {
		System.out.println("running method in temp");
		return 12.5;
	}
	@Bean
	public Double temp8() {
		System.out.println("running method in temp");
		return 12.5;
	}
	@Bean
	public Boolean punithRaj() {
		System.out.println("running method in paper");
		return false;
	}
	@Bean
	public Boolean basu() {
		System.out.println("running method in paper");
		return true;
	}
	@Bean
	public Boolean rajkumar() {
		System.out.println("running method in paper");
		return false;
	}
	@Bean
	public Boolean  praveen() {
		System.out.println("running method in paper");
		return true;
	}
	@Bean
	public Boolean babu (){
		System.out.println("running method in paper");
		return false;
	}
	@Bean
	public Boolean rocks() {
		System.out.println("running method in paper");
		return true;
	}
	@Bean
	public Boolean priyanka() {
		System.out.println("running method in paper");
		return true;
	}
	@Bean
	public Boolean annesh2() {
		System.out.println("running method in paper");
		return true;
	}
	@Bean
	public Boolean kiran() {
		System.out.println("running method in paper");
		return false;
	}
	@Bean
	public Boolean Vinayak() {
		System.out.println("running method in paper");
		return false;
	}
	@Bean
   public Byte bytocha1() {
	   System.out.println("running method in bytoTee");
	   return 15;
   }
	@Bean
   public Byte bytocha2() {
	   System.out.println("running method in bytoTee");
	   return 12;
   }
	@Bean
   public Byte bytocha3() {
	   System.out.println("running method in bytoTee");
	   return 11;
   }
	@Bean
   public Byte bytocha4() {
	   System.out.println("running method in bytoTee");
	   return 17;
   }
	@Bean
   public Byte bytocha5() {
	   System.out.println("running method in bytoTee");
	   return 19;
   }
	@Bean
   public Byte bytocha6() {
	   System.out.println("running method in bytoTee");
	   return 16;
   }
	@Bean
   public Byte bytocha7() {
	   System.out.println("running method in bytoTee");
	   return 17;
   }
	@Bean
   public Byte bytocha8() {
	   System.out.println("running method in bytoTee");
	   return 18;
   }
	@Bean
   public Byte bytocha9() {
	   System.out.println("running method in bytoTee");
	   return 19;
   }
	@Bean
   public Byte bytocha10() {
	   System.out.println("running method in bytoTee");
	   return 20;
   }
	@Bean
	public Character code1() {
		System.out.println("running method in code");
		return 'A';
	}
	@Bean
	public Character code2() {
		System.out.println("running method in code");
		return 'B';
	}
	@Bean
	public Character code3() {
		System.out.println("running method in code");
		return 'C';
	}
	@Bean
	public Character code4() {
		System.out.println("running method in code");
		return 'D';
	}
	@Bean
	public Character code5() {
		System.out.println("running method in code");
		return 'E';
	}
	@Bean
	public Character code6() {
		System.out.println("running method in code");
		return 'F';
	}
	@Bean
	public Character code7() {
		System.out.println("running method in code");
		return 'G';
	}
	@Bean
	public Character code8() {
		System.out.println("running method in code");
		return 'H';
	}
	@Bean
	public Character code9() {
		System.out.println("running method in code");
		return 'K';
	}



}
