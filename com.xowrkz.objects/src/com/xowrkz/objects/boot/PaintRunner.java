package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint ();
		paint.setBrand("Nippon Paint");
		paint.setColour("PINK");
		paint.setPrice(250);
		paint.setQuality(true);
		paint.setquantity(50);
		System.out.println(paint);
		
		Paint paint2 = new Paint ();
		paint2.setBrand("Nippon Paint");
		paint2.setColour("PINK");
		paint2.setPrice(250);
		paint2.setQuality(true);
		paint2.setquantity(50);
		System.out.println(paint2);
		
		System.out.println("HashCode is ::"+paint.hashCode()+"  Original HashCode is "+System.identityHashCode(paint));
	}

}
