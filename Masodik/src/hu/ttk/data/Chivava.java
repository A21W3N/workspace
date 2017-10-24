package hu.ttk.data;

import java.util.Date;

public class Chivava extends Dog implements Torzskonyv{
	
	private Long batteryLifeTime;
	private String familyName;
	private Date inspectionDate;
/**
 * Ez egy csivava objektum konstruktora
 * @param familyName: a család neve
 * @param name: a beceneve
 * @param legCount: lábak száma(minél több annál jobb,amíg <=4)
 * @param color rasszizmus1.0
 * @param inspectionDate nembeteg
 */
	public Chivava(String familyName, String name, int legCount, String color, Date inspectionDate) {
		super(name, "Chivava", legCount, color);
		this.familyName=familyName;
		this.inspectionDate=inspectionDate;
		
	}

	public Long getBatteryLifeTime() {
		return batteryLifeTime;
	}

	
	public String getFamilyName() {
		
		return familyName;
	}

	
	public Date getInspectionDate() {
		
		return inspectionDate;
	}

	

	
}
