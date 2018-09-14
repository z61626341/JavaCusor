package AnonymousInnerClass;

public class ClientEvent {
	
	private Client client;
	
	public ClientEvent(Client client) {
		this.client = client;
	}
	public String getIp() {
		return client.ip;
	}
	public String getName() {
		return client.name;
	}
}
