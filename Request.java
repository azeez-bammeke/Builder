package Lab_7_1;

public class Request {

	// private member of Request class
	private String reqId;
	private Customer requester;
	private Agent agent;
	private String reqContent;
	private String respContent;
	private boolean isAnswered;
	private boolean isSaleLead;
	private boolean needCallBack;

	// Request constructor
	// adding request member class from the builder to the constructor
	private Request(Builder builder) {
		this.requester = builder.requester;
		this.agent = builder.agent;
		this.reqContent = builder.reqContent;
		this.respContent = builder.respContent;
		this.isAnswered = builder.isAnswered;
		this.isSaleLead = builder.isSaleLead;
		this.needCallBack = builder.needCallBack;
		this.reqId = builder.reqId;
	}

	// getter
	public String getReqId() {
		return reqId;
	}

	public Customer getRequester() {
		return requester;
	}

	public Agent getAgent() {
		return agent;
	}

	public String getReqContent() {
		return reqContent;
	}

	public String getRespContent() {
		return respContent;
	}

	public boolean isAnswered() {
		return isAnswered;
	}

	public boolean isSaleLead() {
		return isSaleLead;
	}

	public boolean isNeedCallBack() {
		return needCallBack;
	}

	
//builder
	public static class Builder implements RequestBuilder {
		// member of Builder same as Request class
		private Customer requester;
		private Agent agent;
		private String reqContent;
		private String respContent;
		private boolean isAnswered;
		private boolean isSaleLead;
		private boolean needCallBack;
		private String reqId;

		// Builder constructor
		public Builder() {
		}

		// setting the object of the builder
		public Builder reqId(String reqId) {
			this.reqId = reqId;
			return this;
		}
		
		public Builder requester(Customer requester) {
			this.requester = requester;
			return this;
		}

		public Builder agent(Agent agent) {
			this.agent = agent;
			return this;
		}

		public Builder reqContent(String reqContent) {
			this.reqContent = reqContent;
			return this;
		}

		public Builder respContent(String respContent) {
			this.respContent = respContent;
			return this;
		}

		public Builder isAnswered(boolean isAnswered) {
			this.isAnswered = isAnswered;
			return this;
		}

		public Builder isSaleLead(boolean isSaleLead) {
			this.isSaleLead = isSaleLead;
			return this;
		}

		public Builder needCallBack(boolean needCallBack) {
			this.needCallBack = needCallBack;
			return this;
		}

			// Build method
		@Override
		public Request build() {
			return new Request(this);
		}

	}


	@Override
	public String toString() {
		return "Request [reqId=" + reqId + ", requester=" + requester + ", agent=" + agent + ", reqContent="
				+ reqContent + ", respContent=" + respContent + ", isAnswered=" + isAnswered + ", isSaleLead="
				+ isSaleLead + ", needCallBack=" + needCallBack + "]";
	}

//Request toString

}
