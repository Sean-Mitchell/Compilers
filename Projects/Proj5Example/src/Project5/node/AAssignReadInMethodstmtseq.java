/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project5.node;

import Project5.analysis.*;

@SuppressWarnings("nls")
public final class AAssignReadInMethodstmtseq extends PMethodstmtseq
{
    private TId _id_;
    private PArrayOption _arrayOption_;
    private TEquals _equals_;
    private TGet _get_;
    private TLparen _lparen_;
    private TRparen _rparen_;
    private TSemicolon _semicolon_;

    public AAssignReadInMethodstmtseq()
    {
        // Constructor
    }

    public AAssignReadInMethodstmtseq(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PArrayOption _arrayOption_,
        @SuppressWarnings("hiding") TEquals _equals_,
        @SuppressWarnings("hiding") TGet _get_,
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") TRparen _rparen_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setId(_id_);

        setArrayOption(_arrayOption_);

        setEquals(_equals_);

        setGet(_get_);

        setLparen(_lparen_);

        setRparen(_rparen_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AAssignReadInMethodstmtseq(
            cloneNode(this._id_),
            cloneNode(this._arrayOption_),
            cloneNode(this._equals_),
            cloneNode(this._get_),
            cloneNode(this._lparen_),
            cloneNode(this._rparen_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignReadInMethodstmtseq(this);
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

    public TGet getGet()
    {
        return this._get_;
    }

    public void setGet(TGet node)
    {
        if(this._get_ != null)
        {
            this._get_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._get_ = node;
    }

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
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
            + toString(this._get_)
            + toString(this._lparen_)
            + toString(this._rparen_)
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

        if(this._get_ == child)
        {
            this._get_ = null;
            return;
        }

        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
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

        if(this._get_ == oldChild)
        {
            setGet((TGet) newChild);
            return;
        }

        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
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
