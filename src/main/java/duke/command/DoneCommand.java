package duke.command;

import duke.storage.Storage;
import duke.task.Task;
import duke.tasklist.TaskList;

import java.io.IOException;

/**
 * The DoneCommand program calls method to mark task as done.
 *
 * @version 1.1
 * @since 3/2/2020
 */
public class DoneCommand extends Command {

    /**
     * Constructor.
     *
     * @param storage  refers to file storage.
     * @param taskList refers a taskList object that manages the current list of tasks.
     */
    public DoneCommand(Storage storage, TaskList taskList) {

        super(storage, taskList);

    }

    /**
     * Calls method to mark the task as done.
     *
     * @param taskDescriptionArr is a parsed task description which
     *                           contains information such as date
     *                           of task.
     */
    @Override
    public void executeCommand(String[] taskDescriptionArr) {

        try {

            Task t = taskList.getTask(Integer.parseInt(taskDescriptionArr[1]));
            System.out.println(HEADER);
            System.out.println(taskList.markDone(t));
            System.out.println(FOOTER);

        } catch (IOException e) {

            System.out.println(e);

        }
    }
}