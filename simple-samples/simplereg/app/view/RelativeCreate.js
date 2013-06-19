/*
 * File: app/view/RelativeCreate.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('Simplereg.view.RelativeCreate', {
    extend: 'Ext.window.Window',

    requires: [
        'Simplereg.view.override.RelativeCreate'
    ],

    id: 'relative-create',
    itemId: 'dialog',
    width: 400,
    closeAction: 'hide',
    iconCls: 'icon-add',
    title: 'Add Relative',
    modal: true,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'Data',
                    trackResetOnLoad: true,
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'bottom',
                            items: [
                                {
                                    xtype: 'button',
                                    itemId: 'reset',
                                    iconCls: 'icon-reset',
                                    text: 'Reset'
                                },
                                {
                                    xtype: 'tbfill'
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'cancel',
                                    iconCls: 'icon-cancel',
                                    text: 'Cancel'
                                },
                                {
                                    xtype: 'button',
                                    itemId: 'submit',
                                    iconCls: 'icon-add',
                                    text: 'Add Relative'
                                }
                            ]
                        }
                    ],
                    items: [
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Person Id',
                            name: 'personId',
                            readOnly: true
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            hidden: true,
                            fieldLabel: 'Version',
                            name: 'version',
                            readOnly: true
                        },
                        {
                            xtype: 'combobox',
                            anchor: '100%',
                            fieldLabel: 'Type',
                            name: 'rtype',
                            allowBlank: false,
                            editable: false,
                            displayField: 'name',
                            forceSelection: true,
                            queryMode: 'local',
                            queryParam: 'name',
                            store: 'RelativeTypes',
                            valueField: 'value'
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            fieldLabel: 'Rel. Person Id',
                            name: 'relPerson.id'
                        }
                    ]
                }
            ]
        });

        me.callParent(arguments);
    }

});