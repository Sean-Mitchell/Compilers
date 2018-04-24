/* This file was generated by SableCC (http://www.sablecc.org/). */

package Project5.node;

import Project5.analysis.*;

@SuppressWarnings("nls")
public final class AAnotherCaseCaseHelper extends PCaseHelper
{
    private TCase _case_;
    private TLparen _lparen_;
    private TInt _int_;
    private TRparen _rparen_;
    private TColon _colon_;
    private PStmtseq _stmtseq_;
    private PBreakHelper _breakHelper_;
    private PCaseHelper _caseHelper_;

    public AAnotherCaseCaseHelper()
    {
        // Constructor
    }

    public AAnotherCaseCaseHelper(
        @SuppressWarnings("hiding") TCase _case_,
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") TInt _int_,
        @SuppressWarnings("hiding") TRparen _rparen_,
        @SuppressWarnings("hiding") TColon _colon_,
        @SuppressWarnings("hiding") PStmtseq _stmtseq_,
        @SuppressWarnings("hiding") PBreakHelper _breakHelper_,
        @SuppressWarnings("hiding") PCaseHelper _caseHelper_)
    {
        // Constructor
        setCase(_case_);

        setLparen(_lparen_);

        setInt(_int_);

        setRparen(_rparen_);

        setColon(_colon_);

        setStmtseq(_stmtseq_);

        setBreakHelper(_breakHelper_);

        setCaseHelper(_caseHelper_);

    }

    @Override
    public Object clone()
    {
        return new AAnotherCaseCaseHelper(
            cloneNode(this._case_),
            cloneNode(this._lparen_),
            cloneNode(this._int_),
            cloneNode(this._rparen_),
            cloneNode(this._colon_),
            cloneNode(this._stmtseq_),
            cloneNode(this._breakHelper_),
            cloneNode(this._caseHelper_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnotherCaseCaseHelper(this);
    }

    public TCase getCase()
    {
        return this._case_;
    }

    public void setCase(TCase node)
    {
        if(this._case_ != null)
        {
            this._case_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._case_ = node;
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

    public TInt getInt()
    {
        return this._int_;
    }

    public void setInt(TInt node)
    {
        if(this._int_ != null)
        {
            this._int_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._int_ = node;
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

    public TColon getColon()
    {
        return this._colon_;
    }

    public void setColon(TColon node)
    {
        if(this._colon_ != null)
        {
            this._colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colon_ = node;
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

    public PBreakHelper getBreakHelper()
    {
        return this._breakHelper_;
    }

    public void setBreakHelper(PBreakHelper node)
    {
        if(this._breakHelper_ != null)
        {
            this._breakHelper_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._breakHelper_ = node;
    }

    public PCaseHelper getCaseHelper()
    {
        return this._caseHelper_;
    }

    public void setCaseHelper(PCaseHelper node)
    {
        if(this._caseHelper_ != null)
        {
            this._caseHelper_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caseHelper_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._case_)
            + toString(this._lparen_)
            + toString(this._int_)
            + toString(this._rparen_)
            + toString(this._colon_)
            + toString(this._stmtseq_)
            + toString(this._breakHelper_)
            + toString(this._caseHelper_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._case_ == child)
        {
            this._case_ = null;
            return;
        }

        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._int_ == child)
        {
            this._int_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        if(this._colon_ == child)
        {
            this._colon_ = null;
            return;
        }

        if(this._stmtseq_ == child)
        {
            this._stmtseq_ = null;
            return;
        }

        if(this._breakHelper_ == child)
        {
            this._breakHelper_ = null;
            return;
        }

        if(this._caseHelper_ == child)
        {
            this._caseHelper_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._case_ == oldChild)
        {
            setCase((TCase) newChild);
            return;
        }

        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._int_ == oldChild)
        {
            setInt((TInt) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        if(this._colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(this._stmtseq_ == oldChild)
        {
            setStmtseq((PStmtseq) newChild);
            return;
        }

        if(this._breakHelper_ == oldChild)
        {
            setBreakHelper((PBreakHelper) newChild);
            return;
        }

        if(this._caseHelper_ == oldChild)
        {
            setCaseHelper((PCaseHelper) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
