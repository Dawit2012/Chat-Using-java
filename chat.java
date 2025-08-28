package name.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;


public interface Chat extends Remote {

	void delieverMessage(String message, ChatUserProfile sender) throws RemoteException;
	void stopMyChatServer() throws RemoteException;
	boolean registerUser(ChatUserProfile chatUser) throws RemoteException;
	boolean removeUser(ChatUserProfile chatUser) throws RemoteException;
	Set<ChatUserProfile> getCurrentUsers() throws RemoteException;
	
}