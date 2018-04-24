/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project5.node;

import Project5.analysis.*;

@SuppressWarnings("nls")
public final class AAssignBooleanMethodstmtseq extends PMethodstmtseq
{
    private TId _id_;
    private PArrayOption _arrayOption_;
    private TEquals _equals_;
    private PBoolean _boolean_;
    private TSemicolon _semicolon_;

    public AAssignBooleanMethodstmtseq()
    {
        // Constructor
    }

    public AAssignBooleanMethodstmtseq(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PArrayOption _arrayOption_,
        @SuppressWarnings("hiding") TEquals _equals_,
        @SuppressWarnings("hiding") PBoolean _boolean_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setId(_id_);

        setArrayOption(_arrayOption_);

        setEquals(_equals_);

        setBoolean(_boolean_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AAssignBooleanMethodstmtseq(
            cloneNode(this._id_),
            cloneNode(this._arrayOption_),
            cloneNode(this._equals_),
            cloneNode(this._boolean_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignBooleanMethodstmtseq(this);
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

    public PArrayOption getArrayOption()
    {
        return this._arrayOption_;
    }

    public void setArrayOption(PArrayOption node)
    {
        if(this._arrayOption_ != null)
        {
            this._arrayOption_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrayOption_ = node;
    }

    public TEquals getEquals()
    {
        return this._equals_;
    }

    public void setEquals(TEquals node)
    {
        if(this._equals_ != null)
        {
            this._equals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equals_ = node;
    }

    public PBoolean getBoolean()
    {
        return this._boolean_;
    }

    public void setBoolean(PBoolean node)
    {
        if(this._boolean_ != null)
        {
            this._boolean_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolean_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._arrayOption_)
            + toString(this._equals_)
            + toString(this._boolean_)
            + toString(this._semicolon_);
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

        if(this._arrayOption_ == child)
        {
            this._arrayOption_ = null;
            return;
        }

        if(this._equals_ == child)
        {
            this._equals_ = null;
            return;
        }

        if(this._boolean_ == child)
        {
            this._boolean_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
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

        if(this._arrayOption_ == oldChild)
        {
            setArrayOption((PArrayOption) newChild);
            return;
        }

        if(this._equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

        if(this._boolean_ == oldChild)
        {
            setBoolean((PBoolean) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
