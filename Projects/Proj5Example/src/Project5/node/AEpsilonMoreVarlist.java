/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project5.node;

import Project5.analysis.*;

@SuppressWarnings("nls")
public final class AEpsilonMoreVarlist extends PMoreVarlist
{

    public AEpsilonMoreVarlist()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AEpsilonMoreVarlist();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEpsilonMoreVarlist(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
