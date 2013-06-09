/*
 * File: app/view/PersonAdd.js
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

Ext.define('SimpleWeb.view.contact.Add', {
    extend : 'Ext.window.Window',

    id : 'ContactAdd',
    width : 400,
    closeAction : 'hide',
    iconCls : 'icon-add',
    title : 'Add Contact',
    modal : true,
    y : 100,

    initComponent : function() {
        var me = this;

        Ext.applyIf(me, {
            items : [ {
                xtype : 'form',
                itemId : 'contact_form',
                bodyPadding : 10,
                header : false,
                title : 'Contact Data',
                api : {
                    submit : 'simpleService.createContact'
                },
                defaults : {
                    anchor : '100%'
                },
                items : [ {
                    xtype : 'textfield',
                    hidden : true,
                    name : 'person_id',
                    itemId : 'person_id',
                    fieldLabel : 'Person_Id'
                }, {
                    xtype : 'textfield',
                    hidden : true,
                    name : 'personId',
                    itemId : 'personId',
                    fieldLabel : 'PersonId'
                }, {
                    xtype : 'combobox',
                    name : 'ctype',
                    itemId : 'ctype',
                    fieldLabel : 'Type',
                    editable : false,
                    store : [ 'HOME', 'BUSINESS', 'ABROAD' ]
                }, {
                    xtype : 'textfield',
                    itemId : 'address',
                    name : 'address',
                    fieldLabel : 'Address'
                }, {
                    xtype : 'textfield',
                    itemId : 'phoneNumber',
                    name : 'phoneNumber',
                    fieldLabel : 'Phone Number'
                }, {
                    xtype : 'combobox',
                    name : 'countryCode',
                    itemId : 'countryCode',
                    fieldLabel : 'Country'
                } ]
            } ],
            dockedItems : [ {
                xtype : 'toolbar',
                dock : 'bottom',
                items : [ {
                    xtype : 'tbfill'
                }, {
                    xtype : 'button',
                    itemId : 'cancel_dialog',
                    text : 'Cancel'
                }, {
                    xtype : 'button',
                    itemId : 'clear_dialog',
                    text : 'Clear'
                }, {
                    xtype : 'button',
                    itemId : 'accept_add_contact',
                    iconCls : 'icon-accept',
                    text : 'Save New Contact'
                } ]
            } ]
        });

        me.callParent(arguments);
    }

});