package design_pattern.behavioral.observer;

import design_pattern.behavioral.observer.listener.UsageSpecification;
import design_pattern.behavioral.observer.subject.CharactersticSpecification;
import design_pattern.behavioral.observer.subject.EntitySpecification;

/*
 * Defines a one-to-many dependency between objects so that when one object changes state, 
 * all its dependents are notified and updated automatically.
 */
public class ColumnIntroducer {

	public static void addColumnForCharSpec(String column,
			CharactersticSpecification charSpec, UsageSpecification usageSpec) {
		charSpec.addObserver(usageSpec);
		charSpec.addColumn(column);
	}

	public static void addColumnForEntitySpec(String column,
			EntitySpecification entitySpec, UsageSpecification usageSpec) {
		entitySpec.addObserver(usageSpec);
		entitySpec.addColumn(column);
	}
}
