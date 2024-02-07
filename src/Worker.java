public class Worker {
    private OnTaskErrorListener errorCallback;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    private OnTaskDoneListener callback;
    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33){
                errorCallback.onError("Error on task " + i);
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
