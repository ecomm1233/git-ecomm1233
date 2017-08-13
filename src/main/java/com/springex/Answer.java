package com.springex;

public class Answer {

		private int id;
		private String text;
		private String answeredby;
		public Answer() {
			
		}
		public Answer(int id, String text, String answeredby) {
			super();
			this.id = id;
			this.text = text;
			this.answeredby = answeredby;
		}
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getAnsweredby() {
			return answeredby;
		}
		public void setAnsweredby(String answeredby) {
			this.answeredby = answeredby;
		}
		@Override
		public String toString() {
			
			return id+"  "+text+"\n --by "+answeredby;
		}
		
		
}
