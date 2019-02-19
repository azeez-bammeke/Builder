package Lab_7_1;

import java.util.Date;

public class Call {
	private String requestId;
	private Agent agent;

	private Call(Builder builder) {
		this.requestId=builder.requestId;
		this.agent=builder.agent;
	}
	
	public void callPop(Agent agent) {
		this.agent = agent;
		this.requestId = "" + (new Date()).getTime();
	}
	
	public static class Builder{
		private String requestId;
		private Agent agent;
		
		public Builder() {}
		
		public Builder requestId(String requestId) {
			this.requestId = requestId;
			return this;
		}
		
		public Builder agent(Agent agent) {
			this.agent = agent;
			return this;
		}
	}
}
