package interview;

public class User_max {
	public User_max(User[] users) {
		int tail = 24*60*60,head = 0;
		int middle;
		int big=0,min=0;
		int user_max;
		for(;head!=tail;) {
			middle = head+(tail-head)/2;
			for(int j = 0;j<users.length;j++) {
				if(users[j].login_time>tail&&users[j].logout_time<=middle) {
					min++;
				}
				if(users[j].login_time>middle&&users[j].logout_time<=tail) {
					big++;
				}
			}
			if(min>big) {
				tail = middle;
				user_max = min;
			}
			else {
				head = middle;
				user_max = big;
			}
		}
	}
}
public class User {
	int userid;
	int login_time;
	int logout_time;
}
