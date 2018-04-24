/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project5.node;

import Project5.analysis.*;

@SuppressWarnings("nls")
public final class ADecrForIncrStep extends PForIncrStep
{
    private TId _id_;
    private TDecr _decr_;

    public ADecrForIncrStep()
    {
        // Constructor
    }

    public ADecrForIncrStep(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TDecr _decr_)
    {
        // Constructor
        setId(_id_);

        setDecr(_decr_);

    }

    @Override
    public Object clone()
    {
        return new ADecrForIncrStep(
            cloneNode(this._id_),
            cloneNode(this._decr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecrForIncrStep(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TDecr getDecr()
    {
        return this._decr_;
    }

    public void setDecr(TDecr node)
    {
        if(this._decr_ != null)
        {
            this._decr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._decr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._decr_ == child)
        {
            this._decr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._decr_ == oldChild)
        {
            setDecr((TDecr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
