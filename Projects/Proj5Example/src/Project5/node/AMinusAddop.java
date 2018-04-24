/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project5.node;

import Project5.analysis.*;

@SuppressWarnings("nls")
public final class AMinusAddop extends PAddop
{
    private TNegop _negop_;

    public AMinusAddop()
    {
        // Constructor
    }

    public AMinusAddop(
        @SuppressWarnings("hiding") TNegop _negop_)
    {
        // Constructor
        setNegop(_negop_);

    }

    @Override
    public Object clone()
    {
        return new AMinusAddop(
            cloneNode(this._negop_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusAddop(this);
    }

    public TNegop getNegop()
    {
        return this._negop_;
    }

    public void setNegop(TNegop node)
    {
        if(this._negop_ != null)
        {
            this._negop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._negop_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._negop_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._negop_ == child)
        {
            this._negop_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._negop_ == oldChild)
        {
            setNegop((TNegop) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
