package AnonymousInnerClass;

import java.util.ArrayList;

public class ClientQueue {
	public ArrayList<ClientListener> arrayListener = new ArrayList<ClientListener>();
	public ArrayList<Client> arrayClient = new ArrayList<Client>();
	
	public void addListener(ClientListener cl) {
		arrayListener.add(cl);
	}
	
	public void add(Client client) {
		arrayClient.add(client);
		ClientEvent event = new ClientEvent(client);
		for(int i = 0;i < arrayListener.size();i++) {
			ClientListener listener = arrayListener.get(i);
			listener.addClient(event);
		}
	}
	
	public void remove(Client client) {
		arrayClient.remove(client);
		ClientEvent event = new ClientEvent(client);
		for(int i = 0; i < arrayListener.size();i++) {
			ClientListener listener = arrayListener.get(i);
			listener.removeClient(event);
		}
		
	}
}
