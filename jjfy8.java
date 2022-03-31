package com.HandsonExercise;

class Exception1 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String data;
    
    public void setData(String data) {
        this.data = data;
    }
	@Override
	public String getMessage() {
		return "ONE";
	}
}

class Exception2 extends Exception1 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "TWO";
	}
}






