package com.pascalwelsch.compositeandroid.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;


public interface ICompositeDialogFragment extends ICompositeFragment {


    void dismiss();

    void dismissAllowingStateLoss();

    Dialog getDialog();

    LayoutInflater getLayoutInflater(final Bundle savedInstanceState);

    boolean getShowsDialog();

    int getTheme();

    boolean isCancelable();

    void onActivityCreated(final Bundle savedInstanceState);

    void onAttach(final Activity activity);

    void onCancel(final DialogInterface dialog);

    void onCreate(@Nullable final Bundle savedInstanceState);

    Dialog onCreateDialog(final Bundle savedInstanceState);

    void onDestroyView();

    void onDetach();

    void onDismiss(final DialogInterface dialog);

    void onSaveInstanceState(final Bundle outState);

    void onStart();

    void onStop();

    void setCancelable(final boolean cancelable);

    void setShowsDialog(final boolean showsDialog);

    void setStyle(final int style, @StyleRes final int theme);

    void setupDialog(final Dialog dialog, final int style);

    void show(final FragmentManager manager, final String tag);

    int show(final FragmentTransaction transaction, final String tag);

    void super_dismiss();

    void super_dismissAllowingStateLoss();

    Dialog super_getDialog();

    LayoutInflater super_getLayoutInflater(final Bundle savedInstanceState);

    boolean super_getShowsDialog();

    int super_getTheme();

    boolean super_isCancelable();

    void super_onActivityCreated(final Bundle savedInstanceState);

    void super_onAttach(final Activity activity);

    void super_onCancel(final DialogInterface dialog);

    void super_onCreate(@Nullable final Bundle savedInstanceState);

    Dialog super_onCreateDialog(final Bundle savedInstanceState);

    void super_onDestroyView();

    void super_onDetach();

    void super_onDismiss(final DialogInterface dialog);

    void super_onSaveInstanceState(final Bundle outState);

    void super_onStart();

    void super_onStop();

    void super_setCancelable(final boolean cancelable);

    void super_setShowsDialog(final boolean showsDialog);

    void super_setStyle(final int style, @StyleRes final int theme);

    void super_setupDialog(final Dialog dialog, final int style);

    void super_show(final FragmentManager manager, final String tag);

    int super_show(final FragmentTransaction transaction, final String tag);
}
