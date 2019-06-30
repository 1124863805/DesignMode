package cn.java52.State.practice.example1;

//环境类
class ScoreContext
{
    private AbstractState state;
    ScoreContext()
    {
        state=new LowState(this);
    }
    public void setState(AbstractState state)
    {
        this.state=state;
    }
    public AbstractState getState()
    {
        return state;
    }
    public void add(int score)
    {
        state.addScore(score);
    }
}
