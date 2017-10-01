package com.greenhome.domain;

public class GreenHomeObject {
	private String message_type;
	private int SRV;
	private int BZR;
	private int LED1;
	private int LED2;
	private int LED3;
	private int LED4;
	private int FAN;
	private int HUM1;
	private int TEMP1;
	private int HUM2;
	private int TEMP2;
	private int HUM3;
	private int TEMP3;
	private int PIR;
	private int LUX;
	private int MAG;
	private int HUM;
	private int SUN;
	private int NFC;

	/**
	 * @return the sRV
	 */
	public int getSRV() {
		return SRV;
	}

	/**
	 * @param sRV
	 *            the sRV to set
	 */
	public void setSRV(int sRV) {
		SRV = sRV;
	}

	/**
	 * @return the bZR
	 */
	public int getBZR() {
		return BZR;
	}

	/**
	 * @param bZR
	 *            the bZR to set
	 */
	public void setBZR(int bZR) {
		BZR = bZR;
	}

	/**
	 * @return the lED1
	 */
	public int getLED1() {
		return LED1;
	}

	/**
	 * @param lED1
	 *            the lED1 to set
	 */
	public void setLED1(int lED1) {
		LED1 = lED1;
	}

	/**
	 * @return the lED2
	 */
	public int getLED2() {
		return LED2;
	}

	/**
	 * @param lED2
	 *            the lED2 to set
	 */
	public void setLED2(int lED2) {
		LED2 = lED2;
	}

	/**
	 * @return the lED3
	 */
	public int getLED3() {
		return LED3;
	}

	/**
	 * @param lED3
	 *            the lED3 to set
	 */
	public void setLED3(int lED3) {
		LED3 = lED3;
	}

	/**
	 * @return the lED4
	 */
	public int getLED4() {
		return LED4;
	}

	/**
	 * @param lED4
	 *            the lED4 to set
	 */
	public void setLED4(int lED4) {
		LED4 = lED4;
	}

	/**
	 * @return the fAN
	 */
	public int getFAN() {
		return FAN;
	}

	/**
	 * @param fAN
	 *            the fAN to set
	 */
	public void setFAN(int fAN) {
		FAN = fAN;
	}

	/**
	 * @return the hUM1
	 */
	public int getHUM1() {
		return HUM1;
	}

	/**
	 * @param hUM1
	 *            the hUM1 to set
	 */
	public void setHUM1(int hUM1) {
		HUM1 = hUM1;
	}

	/**
	 * @return the tEMP1
	 */
	public int getTEMP1() {
		return TEMP1;
	}

	/**
	 * @param tEMP1
	 *            the tEMP1 to set
	 */
	public void setTEMP1(int tEMP1) {
		TEMP1 = tEMP1;
	}

	/**
	 * @return the hUM2
	 */
	public int getHUM2() {
		return HUM2;
	}

	/**
	 * @param hUM2
	 *            the hUM2 to set
	 */
	public void setHUM2(int hUM2) {
		HUM2 = hUM2;
	}

	/**
	 * @return the hUM3
	 */
	public int getHUM3() {
		return HUM3;
	}

	/**
	 * @param hUM3
	 *            the hUM3 to set
	 */
	public void setHUM3(int hUM3) {
		HUM3 = hUM3;
	}

	/**
	 * @return the tEMP3
	 */
	public int getTEMP3() {
		return TEMP3;
	}

	/**
	 * @param tEMP3
	 *            the tEMP3 to set
	 */
	public void setTEMP3(int tEMP3) {
		TEMP3 = tEMP3;
	}

	/**
	 * @return the pIR
	 */
	public int getPIR() {
		return PIR;
	}

	/**
	 * @param pIR
	 *            the pIR to set
	 */
	public void setPIR(int pIR) {
		PIR = pIR;
	}

	/**
	 * @return the lUX
	 */
	public int getLUX() {
		return LUX;
	}

	/**
	 * @param lUX
	 *            the lUX to set
	 */
	public void setLUX(int lUX) {
		LUX = lUX;
	}

	/**
	 * @return the mAG
	 */
	public int getMAG() {
		return MAG;
	}

	/**
	 * @param mAG
	 *            the mAG to set
	 */
	public void setMAG(int mAG) {
		MAG = mAG;
	}

	/**
	 * @return the hMD
	 */
	public int getHUM() {
		return HUM;
	}

	/**
	 * @param hMD
	 *            the hMD to set
	 */
	public void setHUM(int hUM) {
		HUM = hUM;
	}

	/**
	 * @return the sUN
	 */
	public int getSUN() {
		return SUN;
	}

	/**
	 * @param sUN
	 *            the sUN to set
	 */
	public void setSUN(int sUN) {
		SUN = sUN;
	}

	/**
	 * @return the nFC
	 */
	public int getNFC() {
		return NFC;
	}

	/**
	 * @param nFC
	 *            the nFC to set
	 */
	public void setNFC(int nFC) {
		NFC = nFC;
	}

	/**
	 * @return the message_type
	 */
	public String getMessage_type() {
		return message_type;
	}

	/**
	 * @param message_type the message_type to set
	 */
	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}
	/**
	 * @return the tEMP2
	 */
	public int getTEMP2() {
		return TEMP2;
	}

	/**
	 * @param tEMP2 the tEMP2 to set
	 */
	public void setTEMP2(int tEMP2) {
		TEMP2 = tEMP2;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{\"message_type\":\"" + message_type + "\",\"SRV\":" + SRV + 
				", \"BZR\":" + BZR + ", \"LED1\":" + LED1 + ", \"LED2\":" + LED2 +
				", \"LED3\":" + LED3 + ", \"LED4\":"
				+ LED4 + ", \"FAN\":" + FAN + ", \"HUM1\":" + HUM1 + ", \"TEMP1\":" + TEMP1 +
				", \"HUM2\":" + HUM2 + ",\"HUM3\":" + HUM3+ ",\"TEMP2\":" + TEMP2
				+ ", \"TEMP3\":" + TEMP3 + ", \"PIR\":" + PIR + 
				", \"LUX\":" + LUX + ", \"MAG\":" + MAG + ", \"HUM\":" + HUM + ", \"SUN\":"
				+ SUN + ", \"NFC\":" + NFC + ", \"ALERT_MESSAGE\":\"\"}";
	}
}
