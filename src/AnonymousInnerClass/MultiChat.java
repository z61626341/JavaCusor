package AnonymousInnerClass;

public class MultiChat {

	public static void main(String[] args) {
		Client c1 = new Client("127.0.0.1", "Caterpillar");
		Client c2 = new Client("192.168.0.2", "Justin");
		
		ClientQueue queue = new ClientQueue();
		
		queue.addListener(new ClientListener() {
			@Override
			public void addClient(ClientEvent event) {
				System.out.println(event.getName()+" : 從"+event.getIp()+"已連線");
			}

			@Override
			public void removeClient(ClientEvent event) {
				System.out.println(event.getName()+" : 從"+event.getIp()+"已離線");
			}
			
		});

		queue.add(c1);	
		queue.add(c2);

		queue.remove(c1);
		queue.remove(c2);

	}

}
