package steps;

import pages.TaskBarPages;

public class TaskBarSteps extends TaskBarPages {

    public TaskBarSteps taskbarHover()
    {
        taskbar.hover();
        return this;
    }


    public TaskBarSteps customerButtonClick()
    {
        customerButton.click();
        return this;
    }

    public TaskBarSteps contactListButtonClick()
    {
        contactListButton.click();
        return this;
    }

    public TaskBarSteps customersListClick() {

        customersList.click();

        return this;
    }

}
