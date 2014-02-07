package fit2drive.data.bindings.validators;

import org.jdesktop.beansbinding.Validator;

public class PositiveIntegerValidator extends Validator<Integer> {

	@Override
	public Result validate(Integer input) {
		if (input < 0) {
			return new Result(null, "Input: " + input + " is less than 0");
		}
		return null;
	}

}

