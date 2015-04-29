package com.example.fw;

public class GroupData implements Comparable<GroupData>{
	private String name;
	private String header;
	private String footer;

	public GroupData(String groupname, String groupheader, String groupfooter) {
		this.name = groupname;
		this.header = groupheader;
		this.footer = groupfooter;
	}
	
	public GroupData() {
		
	}

	

	@Override
	public String toString() {
		return "GroupData [name=" + name + ", header=" + header + ", footer="
				+ footer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupData other = (GroupData) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(GroupData other) {		
		return this.name.toLowerCase().compareTo(other.name.toLowerCase());
	}

	public GroupData withName(String name) {
		this.name = name;		
		return this;
	}
	
	public GroupData withHeader(String header) {
		this.header = header;	
		return this;
	}
	
	public GroupData withFooter(String footer) {
		this.footer = footer;	
		return this;
	}

	
	public String getHeader() {
		return header;
	}

	public String getFooter() {
		return footer;
	}

	public String getName() {
		return name;
	}
	
	
	
}