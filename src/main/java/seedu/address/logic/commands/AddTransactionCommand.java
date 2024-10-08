package seedu.address.logic.commands;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Adds a transaction to an existing person in the address book.
 */
public class AddTransactionCommand extends Command {

    public static final String COMMAND_WORD = "addt";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": adds a transaction to selected person.\n"
            + "Parameters: "
            + "INDEX (must be a positive integer)"
            + "d/" + "DESCRIPTION"
            + "amt/" + "AMOUNT"
            + "o/" + "OTHER PARTY"
            + "dt/" + "DATE\n"
            + "Example: " + COMMAND_WORD + " 1 "
            + "d/" + "buy raw materials"
            + "amt/" + "-100"
            + "o/" + "Company XYZ"
            + "dt" + "10/10/2024";

    public static final String MESSAGE_SUCCESS = "New transaction added: %1$s";

    private final Index index;
    private final String description;
    private final int amount;
    private final String otherParty;
    private final String date;

    /**
     * @param index index of person to add transactions to
     * @param description description of transaction
     * @param amount amount of money earned or spent
     * @param otherParty name of the other party involved in transaction
     * @param date date of transaction
     */
    public AddTransactionCommand(Index index, String description, int amount,
                                 String otherParty, String date) {
        requireAllNonNull(index, description, amount, otherParty, date);

        this.index = index;
        this.description = description;
        this.amount = amount;
        this.otherParty = otherParty;
        this.date = date;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        //to be implemented
        throw new CommandException(Messages.MESSAGE_UNKNOWN_COMMAND);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof AddTransactionCommand)) {
            return false;
        }

        AddTransactionCommand otherCommand = (AddTransactionCommand) other;
        return index.equals(otherCommand.index)
                && description.equals(otherCommand.description)
                && amount == otherCommand.amount
                && otherParty.equals(otherCommand.otherParty)
                && date.equals(otherCommand.otherParty);
    }

}
