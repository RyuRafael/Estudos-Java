package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

	private String userNome;
	private Date moment;

	public LogEntry(String userNome, Date moment) {
		this.userNome = userNome;
		this.moment = moment;
	}

	public String getUserNome() {
		return userNome;
	}

	public void setUserNome(String userNome) {
		this.userNome = userNome;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userNome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(userNome, other.userNome);
	}
	
	

}
