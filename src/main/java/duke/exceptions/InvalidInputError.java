package duke.exceptions;

/**
 * The InvalidInputError program is an error thrown when user inputs an invalid input.
 *
 * @version 1.0
 * @since 28/1/2020
 */
public class InvalidInputError extends Exceptions {

    public InvalidInputError() {

        super(null);
    }

    /**
     * Constructs error message with respect the error.
     *
     * @return error message of the error.
     */
    @Override
    public String errorMessage() {

        return "\nOOPS! I'm sorry, but I don't know what that means.";
    }
}
