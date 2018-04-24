/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project5.node;

import Project5.analysis.*;

@SuppressWarnings("nls")
public final class AMethodDeclMethodstmtseq extends PMethodstmtseq
{
    private PType _type_;
    private TId _id_;
    private TLparen _lparen_;
    private PVarlist _varlist_;
    private TRparen _rparen_;
    private TLcurly _lcurly_;
    private PStmtseq _stmtseq_;
    private TRcurly _rcurly_;

    public AMethodDeclMethodstmtseq()
    {
        // Constructor
    }

    public AMethodDeclMethodstmtseq(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") PVarlist _varlist_,
        @SuppressWarnings("hiding") TRparen _rparen_,
        @SuppressWarnings("hiding") TLcurly _lcurly_,
        @SuppressWarnings("hiding") PStmtseq _stmtseq_,
        @SuppressWarnings("hiding") TRcurly _rcurly_)
    {
        // Constructor
        setType(_type_);

        setId(_id_);

        setLparen(_lparen_);

        setVarlist(_varlist_);

        setRparen(_rparen_);

        setLcurly(_lcurly_);

        setStmtseq(_stmtseq_);

        setRcurly(_rcurly_);

    }

    @Override
    public Object clone()
    {
        return new AMethodDeclMethodstmtseq(
            cloneNode(this._type_),
            cloneNode(this._id_),
            cloneNode(this._lparen_),
            cloneNode(this._varlist_),
            cloneNode(this._rparen_),
            cloneNode(this._lcurly_),
            cloneNode(this._stmtseq_),
            cloneNode(this._rcurly_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMethodDeclMethodstmtseq(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
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

    public PVarlist getVarlist()
    {
        return this._varlist_;
    }

    public void setVarlist(PVarlist node)
    {
        if(this._varlist_ != null)
        {
            this._varlist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varlist_ = node;
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

    public TLcurly getLcurly()
    {
        return this._lcurly_;
    }

    public void setLcurly(TLcurly node)
    {
        if(this._lcurly_ != null)
        {
            this._lcurly_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lcurly_ = node;
    }

    public PStmtseq getStmtseq()
    {
        return this._stmtseq_;
    }

    public void setStmtseq(PStmtseq node)
    {
        if(this._stmtseq_ != null)
        {
            this._stmtseq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmtseq_ = node;
    }

    public TRcurly getRcurly()
    {
        return this._rcurly_;
    }

    public void setRcurly(TRcurly node)
    {
        if(this._rcurly_ != null)
        {
            this._rcurly_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rcurly_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._id_)
            + toString(this._lparen_)
            + toString(this._varlist_)
            + toString(this._rparen_)
            + toString(this._lcurly_)
            + toString(this._stmtseq_)
            + toString(this._rcurly_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._varlist_ == child)
        {
            this._varlist_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        if(this._lcurly_ == child)
        {
            this._lcurly_ = null;
            return;
        }

        if(this._stmtseq_ == child)
        {
            this._stmtseq_ = null;
            return;
        }

        if(this._rcurly_ == child)
        {
            this._rcurly_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._varlist_ == oldChild)
        {
            setVarlist((PVarlist) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        if(this._lcurly_ == oldChild)
        {
            setLcurly((TLcurly) newChild);
            return;
        }

        if(this._stmtseq_ == oldChild)
        {
            setStmtseq((PStmtseq) newChild);
            return;
        }

        if(this._rcurly_ == oldChild)
        {
            setRcurly((TRcurly) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
