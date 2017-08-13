package com.demo;

import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class MyInterceptor extends EmptyInterceptor{

		private int updates;
		private int creates;
		private int loads;
		@Override
		public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
			
			super.onDelete(entity, id, state, propertyNames, types);
			System.out.println("In On Delete");
		}
		@Override
		public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
				String[] propertyNames, Type[] types) {
			 if ( entity instanceof Employees ) {
		          System.out.println("Update Operation");
		          return true; 
		       }
		       return false;
			//return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
		}
		@Override
		public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
			// TODO Auto-generated method stub
			System.out.println("In Load function");
			return super.onLoad(entity, id, state, propertyNames, types);
		}
		@Override
		public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
			if ( entity instanceof Employees ) {
		          System.out.println("Create Operation");
		          return true; 
		       }
		       return false;
			//return super.onSave(entity, id, state, propertyNames, types);
		}
		@Override
		public void postFlush(Iterator entities) {
			System.out.println("Pre flush");
			super.postFlush(entities);
		}
		@Override
		public void preFlush(Iterator entities) {
			System.out.println("Post Flush");
			super.preFlush(entities);
		}
		
		
}
