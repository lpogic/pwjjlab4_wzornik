package app.core;

public abstract class OpenController {

    private StageHost stageHost;
    private PaneHost paneHost;

    protected OpenController(){}

    public StageHost getStageHost() {
        return stageHost;
    }

    public PaneHost getPaneHost() {
        return paneHost;
    }

    public void setHosts(StageHost stageHost, PaneHost paneHost) {
        this.stageHost = stageHost;
        this.paneHost = paneHost;
    }

    public void open(Object ... bundle){}

    public void init(OpenModel model){}
}
