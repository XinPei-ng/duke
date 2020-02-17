package duke.command;

import duke.storage.Storage;
import duke.task.Task;
import duke.tasklist.TaskList;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * The CheckDup command checks if the current user input is a duplicate.
 *
 * @version 1.1
 * @since 10/2/2020
 */
public class CheckDupCommand extends Command {

    /**
     * Constructor.
     *
     * @param storage  refers to file storage.
     * @param taskList refers a taskList object that manages the current list of tasks.
     */
    public CheckDupCommand(Storage storage, TaskList taskList) {
        super(storage, taskList);
    }

    public String executeCommand(String[] taskDescriptionArr, LocalDateTime[] dateTime) {

        ArrayList taskList = super.taskList.getList();

        for (int i = 0; i < taskList.size(); i++) {

            Task current = (Task) taskList.get(i);
            String type = current.getType().toString();
            String taskDes = current.getTaskDescription();
            LocalDateTime[] dateTimeCurrent = current.getDateTime();

            if (type.equals(taskDescriptionArr[0]) && taskDes.equals(taskDescriptionArr[1])) {

                if (dateTime[0].isEqual(dateTimeCurrent[0]) && dateTime[1].isEqual(dateTimeCurrent[1])) {

                    return "t";
                }

            }

        }

        return "f";
    }
}
