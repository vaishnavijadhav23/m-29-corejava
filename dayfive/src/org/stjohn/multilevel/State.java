package org.stjohn.multilevel;
//parent class1 and child class2
public class State extends Country{

	//private data members
		private String stateName;
		private String language;
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		@Override
		public String toString() {
			return "State [stateName=" + stateName + ", language=" + language + ", getCountryName()=" + getCountryName()
					+ ", getCountryCapital()=" + getCountryCapital() + "]";
		}
	
	
	
}
